package ru.practicum.request_service.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.request_service.model.ParticipationRequestStatus;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ParticipationRequestDto {

    Long id;

    Long event;

    Long requester;

    ParticipationRequestStatus status;

    LocalDateTime created;
}
