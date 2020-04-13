package com.eara.todo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToDoItem  implements Comparable<ToDoItem>{
    private Long id;
    private String name;
    private boolean completed;

    @Override
    public int compareTo(ToDoItem toDoItem) {
        return 0;
    }
}
