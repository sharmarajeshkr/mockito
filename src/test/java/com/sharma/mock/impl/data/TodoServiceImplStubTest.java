package com.sharma.mock.impl.data;

import com.sharma.mock.data.api.TODOServices;
import com.sharma.mock.data.api.TodoBusinessImpl;
import com.sharma.mock.data.api.TodoServiceStubs;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class TodoServiceImplStubTest {

    @Test
    public void todoServiceReturnValues(){
        TODOServices todoServices = new TodoServiceStubs();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServices);
        List<String> filteredTodos =  todoBusiness.retrieveTodosRelatedToSpring("Spring");
        assertEquals(2,filteredTodos.size());
    }

    @Test
    public void todoServiceReturnZeroValues(){
        TODOServices todoServices = new TodoServiceStubs();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServices);
        List<String> filteredTodos =  todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(0,filteredTodos.size());
    }
}
