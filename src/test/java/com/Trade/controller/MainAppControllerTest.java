/*
 * package com.Trade.controller;
 * 
 * import static
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import
 * org.mockito.junit.MockitoJUnitRunner; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.MediaType; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders; import
 * org.springframework.test.web.servlet.result.MockMvcResultMatchers;
 * 
 * import com.Trade.model.User; import
 * com.fasterxml.jackson.databind.ObjectMapper;
 * 
 * @RunWith(MockitoJUnitRunner.class) public class MainAppControllerTest {
 * 
 * @Autowired private MockMvc mvc;
 * 
 * @Test public void testAddUser() throws Exception { mvc.perform(
 * MockMvcRequestBuilders .post("/user") .content(asJsonString(new
 * User(1,"user1"))) .contentType(MediaType.APPLICATION_JSON)
 * .accept(MediaType.APPLICATION_JSON)) .andExpect(status().isCreated())
 * .andExpect(MockMvcResultMatchers.jsonPath("$.user").exists()); }
 * 
 * public static String asJsonString(final Object obj) { try { return new
 * ObjectMapper().writeValueAsString(obj); } catch (Exception e) { throw new
 * RuntimeException(e); } }
 * 
 * 
 * }
 */