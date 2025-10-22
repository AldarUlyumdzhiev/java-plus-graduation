package ru.practicum.compilations.dto;

import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateCompilationRequest {

    Set<Long> events;

    Boolean pinned;

    @Size(min = 1, max = 50, message = "Field: title. Error: length must be between 1 and 50 symbols.")
    String title;
}
