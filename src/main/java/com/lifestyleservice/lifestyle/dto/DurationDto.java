package com.lifestyleservice.lifestyle.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lifestyleservice.lifestyle.enums.DurationType;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DurationDto {
    private Long id;
    @NotNull
    private DurationType durationType;
    @NotNull
    private Long duration;
}
