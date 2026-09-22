package ru.buns.todo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.buns.todo.util.Status;

@AllArgsConstructor
@Data
public class Task {
    private String title;
    private String description;
    private Status status;

}
