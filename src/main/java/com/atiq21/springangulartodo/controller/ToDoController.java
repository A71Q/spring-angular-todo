package com.atiq21.springangulartodo.controller;

import com.atiq21.springangulartodo.domain.ToDo;
import com.atiq21.springangulartodo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Atiqur Rahman
 * @since 3/06/15 2:09 PM
 */
@Controller
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @RequestMapping(value = "/all.json")
    @ResponseBody
    public List<ToDo> viewAllToDos() {
        return toDoService.allToDos();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void addTodo(@RequestBody ToDo todo) {
        System.out.println(todo);
        toDoService.addToDo(todo);
    }

    @RequestMapping("/layout")
    public String getTodoPartialPage() {
        return "layout/todo";
    }
}
