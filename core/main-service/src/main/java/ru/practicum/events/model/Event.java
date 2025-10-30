package ru.practicum.events.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.category.model.Category;
import ru.practicum.users.model.User;

import java.time.LocalDateTime;

@Entity
@Table(name = "events")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    String annotation;

    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;

    @Transient
    Integer confirmedRequests;

    String description;

    @Column(name = "event_date")
    LocalDateTime eventDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "location_id")
    Location location;

    @Column(name = "is_paid")
    boolean paid;

    @Column(name = "participant_limit")
    int participantLimit;

    @Column(name = "request_moderation")
    boolean requestModeration;

    @ManyToOne
    @JoinColumn(name = "initiator_id")
    User initiator;

    @Column(name = "creation_date")
    LocalDateTime createdOn;

    @Column(name = "publication_date")
    LocalDateTime publishedOn;

    @Enumerated(EnumType.STRING)
    StateEvent state;

    @Transient
    Integer views;
}
