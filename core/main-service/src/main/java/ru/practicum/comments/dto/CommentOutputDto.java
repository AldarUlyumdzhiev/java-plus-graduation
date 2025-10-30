package ru.practicum.comments.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.comments.model.CommentsStatus;
import ru.practicum.events.dto.EventShortDto;
import ru.practicum.users.model.User;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentOutputDto {

    Long id;

    User user;

    EventShortDto event;

    String text;

    LocalDateTime created;

    CommentsStatus status;

}
