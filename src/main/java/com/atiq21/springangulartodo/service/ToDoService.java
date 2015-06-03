package com.atiq21.springangulartodo.service;

import com.atiq21.springangulartodo.domain.ToDo;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Atiqur Rahman
 * @since 03/06/2015 7:54 PM
 */
@Service
public class ToDoService {
    List<ToDo> toDos = new ArrayList<ToDo>();

    @PostConstruct
    public void setupTodo() {
        toDos.add(new ToDo("First To Do", new Date()));
        toDos.add(new ToDo("Second To Do", new Date()));
        toDos.add(new ToDo("Third To Do", new Date()));
    }

    public List<ToDo> allToDos() {
        return toDos;
    }

    public void addToDo(ToDo todo) {
        if (!toDos.contains(todo)) {
            toDos.add(todo);
        }
    }

    public void deleteToDo(ToDo todo) {
        if (toDos.contains(todo)) {
            toDos.remove(todo);
        }
    }

    public void deleteAllToDo() {
        toDos.clear();
    }


    public void updateToDo(int position, ToDo todo) {
        toDos.set(position, todo);
    }
}
