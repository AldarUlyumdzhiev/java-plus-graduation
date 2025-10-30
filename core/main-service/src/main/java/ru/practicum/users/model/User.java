package ru.practicum.users.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; // уникальный идентификатор пользователя;

    @Column(name = "name")
    String name; // имя или логин пользователя;

    @Column(name = "email")
    String email; // адрес электронной почты

}
