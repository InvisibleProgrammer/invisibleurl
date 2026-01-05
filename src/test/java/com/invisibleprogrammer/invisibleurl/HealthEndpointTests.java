package com.invisibleprogrammer.invisibleurl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class HealthEndpointTests {

    final String actuatorPath = "/actuator";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void healthEndpointIsAvailable() throws Exception {
        String healthEndpoint = actuatorPath + "/health";

        mockMvc.perform((get(healthEndpoint)))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/vnd.spring-boot.actuator.v3+json"))
                .andExpect(jsonPath("$.status").value("UP"));
    }
}
