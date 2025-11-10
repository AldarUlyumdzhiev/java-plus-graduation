package ru.practicum.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.request_service.model.ParticipationRequestStatus;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "participation_request",
        uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "event_id"})
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ParticipationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "user_id", nullable = false)
    Long userId;

    @Column(name = "event_id", nullable = false)
    Long eventId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    ParticipationRequestStatus status;

    @Column(nullable = false)
    LocalDateTime created;

}

