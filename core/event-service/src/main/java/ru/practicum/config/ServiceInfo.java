package ru.practicum.config;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class ServiceInfo {

    @Value("${spring.application.name}")
    private String serviceName;

}
