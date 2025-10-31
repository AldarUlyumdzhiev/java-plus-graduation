package ru.practicum.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Compilation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;

    Boolean pinned;

    @ElementCollection
    @CollectionTable(name = "compilation_event", joinColumns = @JoinColumn(name = "compilation_id"))
    @Column(name = "event_id")
    Set<Long> events;
}
