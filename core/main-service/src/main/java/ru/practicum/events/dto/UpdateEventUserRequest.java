package ru.practicum.events.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.config.DateConfig;
import ru.practicum.events.model.Location;
import ru.practicum.events.validation.TimePresentOrFuture;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateEventUserRequest {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Long id;

    @Size(min = 20, max = 2000)
    String annotation;

    int category;

    @Size(min = 20, max = 7000)
    String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateConfig.FORMAT)
    @TimePresentOrFuture
    String eventDate;

    Location location;

    boolean paid;

    @Positive
    Integer participantLimit;

    boolean requestModeration;

    String stateAction;

    @Size(min = 3, max = 120)
    String title;
}
