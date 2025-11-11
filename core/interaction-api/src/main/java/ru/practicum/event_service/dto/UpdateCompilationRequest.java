package ru.practicum.event_service.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class UpdateCompilationRequest {

    List<@NotNull Long> events;

    Boolean pinned;

    @Size(min = 1, max = 50)
    String title;
}
