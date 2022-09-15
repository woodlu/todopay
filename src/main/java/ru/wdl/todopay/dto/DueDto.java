package ru.wdl.todopay.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class DueDto {
    private String string;
    private String lang;
    private boolean isRecurring;
}
