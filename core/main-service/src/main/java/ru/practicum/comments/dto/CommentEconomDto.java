package ru.practicum.comments.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.comments.model.CommentsStatus;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentEconomDto {

    Long id;

    Long userId;

    Long eventId;

    String text;

    LocalDateTime created;

    CommentsStatus status;

}
