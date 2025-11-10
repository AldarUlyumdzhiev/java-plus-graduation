package ru.practicum.event_service.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewEventDto {

    @NotBlank
    @Size(min = 20, max = 2000)
    String annotation;

    @NotBlank
    @Size(min = 20, max = 7000)
    String description;

    @NotNull
    Long category;

    @NotNull
    @Future
    LocalDateTime eventDate;

    @NotNull
    LocationDto location;

    @NotBlank
    @Size(min = 3, max = 120)
    String title;

    Boolean paid;

    @Min(0)
    Integer participantLimit;

    Boolean requestModeration;
}
