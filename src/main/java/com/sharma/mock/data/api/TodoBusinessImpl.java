package com.sharma.mock.data.api;

import com.sharma.mock.data.api.TODOServices;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl  {
    private TODOServices todoService;

    public TodoBusinessImpl(TODOServices todoServices) {
        this.todoService = todoServices;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        // TodoService Actual Method retrieveTodos
        List<String> allTodos = todoService.retrieveTodos(user);
        for (String todo : allTodos) {
            if (todo.contains(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
