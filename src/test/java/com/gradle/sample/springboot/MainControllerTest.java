package com.gradle.sample.springboot;

import com.gradle.sample.springboot.MainController;
import com.nitorcreations.junit.runners.NestedRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * 
 * Distribution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Jun 17, 2016 9:14:29 AM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
@RunWith(NestedRunner.class)
public class MainControllerTest {

	private MockMvc mockMvc;

	/**
	 * Instansiate the 
	 */
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(new MainController()).build();
	}

	@Test
	public void shouldReturnResponseStatusOk() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}

	@Test
	public void shouldRenderTheIndexView() throws Exception {
		mockMvc.perform(get("/")).andExpect(view().name("index"));
	}

}
