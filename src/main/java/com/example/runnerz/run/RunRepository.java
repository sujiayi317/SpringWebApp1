package com.example.runnerz.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.CharBuffer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    Optional<Run> findById(Integer id) {
        return runs.stream()
                .filter(run -> Objects.equals(run.id(), id))
                .findFirst();
    }

    @PostConstruct
    private void init() {
        runs.add(new Run(1,
                "First Run",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1),
                5,
                Location.OUTDOOR));

        runs.add(new Run(2,
                "Second Run",
                LocalDateTime.now(),
                LocalDateTime.now().plusMinutes(30),
                2,
                Location.INDOOR));
    }
}
