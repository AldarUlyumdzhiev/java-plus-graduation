package ru.practicum.users.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.config.DateConfig;
import ru.practicum.users.model.ParticipationRequestStatus;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ParticipationRequestDto {

    @NotNull
    @Positive
    Long id;

    @NotNull
    @Positive
    Long requester;

    @NotNull
    @Positive
    Long event;

    @NotNull
    ParticipationRequestStatus status;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DateConfig.FORMAT)
    LocalDateTime created;
}