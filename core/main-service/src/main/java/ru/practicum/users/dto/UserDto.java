package ru.practicum.users.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.users.validation.NotEmptyUserDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@NotEmptyUserDto
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {

    @NotNull
    @Positive
    Long id; // уникальный идентификатор пользователя;

    @Size(max = 200)
    String name; // имя или логин пользователя;

    @Size(max = 50)
    String email; // адрес электронной почты

}
