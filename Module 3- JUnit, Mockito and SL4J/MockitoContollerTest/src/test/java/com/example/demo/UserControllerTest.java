package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

public class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    public UserControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUser() {

        User user = new User();
        user.setId(1L);
        user.setName("John");

        when(userService.getUserById(1L))
                .thenReturn(user);

        ResponseEntity<User> response =
                userController.getUser(1L);

        assertEquals(200,
                response.getStatusCodeValue());

        assertEquals("John",
                response.getBody().getName());

        assertEquals(1L,
                response.getBody().getId());
    }
}
