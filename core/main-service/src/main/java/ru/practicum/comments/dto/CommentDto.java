package ru.practicum.comments.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.comments.model.CommentsStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentDto {

    Long id;

    Long userId;

    Long eventId;

    @NotBlank
    String text;

    LocalDateTime created;

    CommentsStatus status;

}
