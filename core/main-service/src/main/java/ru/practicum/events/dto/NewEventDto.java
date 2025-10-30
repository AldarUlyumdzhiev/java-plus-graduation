package ru.practicum.events.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.config.DateConfig;
import ru.practicum.events.model.Location;
import ru.practicum.events.validation.TimeNotEarly;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewEventDto {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    Long id;

    @NotBlank
    @Size(min = 20, max = 2000)
    String annotation;

    @NotNull
    long category;

    @NotBlank
    @Size(min = 20, max = 7000)
    String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateConfig.FORMAT)
    @TimeNotEarly(hours = 2, message = "Время не должно быть ранее чем через 2 часа.")
    String eventDate;

    @NotNull
    Location location;

    boolean paid;

    @PositiveOrZero
    Integer participantLimit;

    Boolean requestModeration;

    @NotBlank
    @Size(min = 3, max = 120)
    String title;

}
