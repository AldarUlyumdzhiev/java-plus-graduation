package ru.practicum.event_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.event_service.model.EventState;
import ru.practicum.user_service.dto.UserShortDto;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class EventFullDto implements EventRating {

    Long id;

    @NotBlank
    String title;

    @NotBlank
    String annotation;

    @NotBlank
    String description;

    @NotNull
    CategoryDto category;

    @NotNull
    Boolean paid;

    @NotNull
    LocalDateTime eventDate;

    LocalDateTime createdOn;

    LocalDateTime publishedOn;

    Integer participantLimit;

    Boolean requestModeration;

    EventState state;

    Long confirmedRequests;

    Double rating;

    LocationDto location;

    UserShortDto initiator;
}
