package com.secExe.secu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SecControllerTest {

    @Autowired
    private MockMvc mock;

    @Test
    @WithMockUser(username = "user", roles = "USER")
    public void testGetAllWithUserRole() throws Exception {
        mock.perform(MockMvcRequestBuilders.get("/entities"))
                .andExpect(status().isOk());
    }

    @Test
    @WithMockUser(username = "admin", roles = "ADMIN")
    public void testGetAllWithAdminRole() throws Exception {
        mock.perform(MockMvcRequestBuilders.get("/entities"))
                .andExpect(status().isOk());
    }

    @Test
    @WithMockUser(username = "user", roles = "USER")
    public void testCreateWithUserRole() throws Exception {
        mock.perform(MockMvcRequestBuilders.post("/entities")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"id\": 1, \"name\": \"Entity1\" }"))
                .andExpect(status().isCreated());
    }

    @Test
    @WithMockUser(username = "admin", roles = "ADMIN")
    public void testCreateWithAdminRole() throws Exception {
        mock.perform(MockMvcRequestBuilders.post("/entities")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"id\": 2, \"name\": \"Entity2\", \"password\": \"123\" }"))
                .andExpect(status().isCreated());
    }
}
