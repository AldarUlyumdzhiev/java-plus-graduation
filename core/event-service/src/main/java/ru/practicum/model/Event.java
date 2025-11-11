package ru.practicum.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import ru.practicum.event_service.model.EventState;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    String annotation;

    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;

    String description;

    @Column(name = "event_date")
    LocalDateTime eventDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "location_id")
    Location location;

    @Column(name = "is_paid")
    Boolean paid;

    @Column(name = "participant_limit")
    Integer participantLimit;

    @Column(name = "request_moderation")
    Boolean requestModeration;

    @Column(name = "initiator_id")
    Long initiator;

    @Column(name = "creation_date")
    LocalDateTime createdOn;

    @Column(name = "publication_date")
    LocalDateTime publishedOn;

    @Enumerated(EnumType.STRING)
    EventState state;

}
