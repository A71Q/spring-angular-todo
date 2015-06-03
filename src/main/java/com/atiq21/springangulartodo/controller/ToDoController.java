package com.atiq21.springangulartodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Atiqur Rahman
 * @since 3/06/15 2:09 PM
 */
@Controller
@RequestMapping("/todo")
public class ToDoController {

    @RequestMapping(value = "/all.json")
    @ResponseBody
    public List<String> viewAllTodos() {

        List<String> todos = new ArrayList<String>();
        todos.add("First");
        todos.add("Second");
        todos.add("Third");
        todos.add("Fourth");

        return todos;
    }
}
