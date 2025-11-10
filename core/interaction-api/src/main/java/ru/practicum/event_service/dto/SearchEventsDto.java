package ru.practicum.event_service.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.event_service.model.EventState;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
public class SearchEventsDto {

    String text;

    List<Long> categories;

    List<Long> users;

    List<EventState> states;

    Boolean paid;

    LocalDateTime rangeStart;

    LocalDateTime rangeEnd;

    Boolean onlyAvailable;

    EventSort sort;

    int from;

    int size;

}