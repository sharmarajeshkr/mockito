package com.sharma.mock.data.api;

import com.sharma.mock.data.api.TODOServices;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStubs implements TODOServices {
    @Override
    public List<String> retrieveTodos(String username) {
        return Arrays.asList(
                "Learn Spring MVC",
                "Learn Spring", "Learn to dance","Learning Mockito"
        );
    }
}
