package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.util.List;

import static java.time.Month.NOVEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student veselin = new Student(
                    "Veselin",
                    "stankov_2001@abv.bg",
                    LocalDate.of(2001, NOVEMBER,14)
            );

            Student alex = new Student(
                    "Alex",
                    "alex_2001@abv.bg",
                    LocalDate.of(2002, NOVEMBER,5)
            );

            repository.saveAll(
                    List.of(veselin, alex)
            );
        };
    }
}
