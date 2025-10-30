package ru.practicum.events.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SearchEventsParams {

    String text;

    List<Long> categories;

    Boolean paid;

    String rangeStart;

    String rangeEnd;

    Boolean onlyAvailable;

    String sort;

    int from;

    int size;

}