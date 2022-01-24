package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

@Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
        Student tomas = new Student(
                "Tomas",
                "tomas@gmail.com",
                LocalDate.of(2000,
                        Month.APRIL,
                        5));

        Student petras = new Student(
                "Petras",
                "petras@gmail.com",
                LocalDate.of(2000,
                        Month.APRIL,
                        5));

    repository.saveAll(
            List.of(tomas, petras)
    );
};
}
}
