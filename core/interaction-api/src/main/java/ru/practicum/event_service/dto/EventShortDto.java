package ru.practicum.event_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.user_service.dto.UserShortDto;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EventShortDto implements EventViews {

    Long id;

    @NotBlank
    String title;

    @NotBlank
    String annotation;

    @NotNull
    CategoryDto category;

    @NotNull
    Boolean paid;

    @NotNull
    LocalDateTime eventDate;

    Long confirmedRequests;

    Long views;

    @NotNull
    UserShortDto initiator;
}
