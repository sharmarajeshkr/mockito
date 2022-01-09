package com.sharma.testmock;

import com.sharma.mock.data.api.TODOServices;
import com.sharma.mock.data.api.TodoBusinessImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoServiceImpMock {

    private static List<String> DEFAULT_VALUE = Arrays.asList();
    private static List<String> DUMMY_VALUE = Arrays.asList("Learn Spring MVC"," Learn Spring", "Learn to dance","Learning Mockito");

    TODOServices todoServices =  mock(TODOServices.class);

    @Test
    public void todoServiceReturnEmptyValues(){
        // Mock Service class to provide implementation
        // instead of using Stubbing
        when(todoServices.retrieveTodos("Empty")).thenReturn( DEFAULT_VALUE);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServices);
        List<String> filterService = todoBusiness.retrieveTodosRelatedToSpring("Empty");
        assertEquals(0,filterService.size());
    }

    @Test
    public void todoServiceReturnValues(){
        // Mock Service class to provide implementation
        // instead of using Stubbing
        when(todoServices.retrieveTodos("Dummy")).thenReturn( DUMMY_VALUE);
       TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServices);
       List<String> filterService = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
       assertEquals(0,filterService.size());
    }

    @Test
    public void todoServiceReturnValidValues(){
        // Mock Service class to provide implementation
        // instead of using Stubbing
        when(todoServices.retrieveTodos("Spring")).thenReturn(DUMMY_VALUE);
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServices);
        List<String> filterService = todoBusiness.retrieveTodosRelatedToSpring("Spring");
        assertEquals(2,filterService.size());
    }

}
