package ru.buns.todo.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Status {
    IN_PROGRESS(1),
    COMPLETED(2),
    DELETED(3);

    private final int id;
}
