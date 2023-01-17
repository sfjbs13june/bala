package com.bala.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)

public class GreetingControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGreetingControllerIntegrationGreet() throws Exception {
        ResultActions responseEntity = mockMvc.perform(get("/greet"));
        responseEntity.andExpect(status().isOk());
        String res = responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("Greet from App", res);
    }

    @Test
    public void testGreetingControllerIntegrationWelcome() throws Exception
    {
        ResultActions responseEntity = mockMvc.perform(get("/welcome"));
        responseEntity.andExpect(status().isOk());
        String res=responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("Welcome from App",res);
    }

    @Test
    public void testGreetingControllerIntegrationHi() throws Exception {
        ResultActions responseEntity = mockMvc.perform(get("/hi"));
        responseEntity.andExpect(status().isOk());
        String res = responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("Hi from App", res);
    }

    @Test
    public void testGreetingControllerIntegrationThanks() throws Exception
    {
        ResultActions responseEntity = mockMvc.perform(get("/thanks"));
        responseEntity.andExpect(status().isOk());
        String res=responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("Thanks from App",res);
    }
}
