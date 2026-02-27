package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.TodoMapper;

@Service
public class TodoService {

    private final TodoMapper todoMapper;

    public TodoService(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }

    public List<Todo> findAll() {
        return todoMapper.findAll();
    }

    public void create(Todo todo) {
        if (todo.getCompleted() == null) {
            todo.setCompleted(false);
        }
        todoMapper.insert(todo);
    }
}
