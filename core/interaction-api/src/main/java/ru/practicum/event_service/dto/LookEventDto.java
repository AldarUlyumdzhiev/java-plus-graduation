package ru.practicum.event_service.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
public class LookEventDto {

    private Long id;

    private String uri;

    private String ip;

}