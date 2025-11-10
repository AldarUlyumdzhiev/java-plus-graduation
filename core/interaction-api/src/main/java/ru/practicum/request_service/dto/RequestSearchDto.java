package ru.practicum.request_service.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.request_service.model.ParticipationRequestStatus;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RequestSearchDto {
    List<Long> eventIds;
    ParticipationRequestStatus status;
}
