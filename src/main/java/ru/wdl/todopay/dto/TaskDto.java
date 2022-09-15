package ru.wdl.todopay.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class TaskDto {
    private long id;
    private String content;
    private String description;
    private DueDto due;
}
