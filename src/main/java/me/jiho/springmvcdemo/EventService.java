package me.jiho.springmvcdemo;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {
    public List<Event> getEvents() {
        Event event1 = Event.builder()
                .name("영어 스터디")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2020, 1, 10, 10, 0))
                .endDateTime(LocalDateTime.of(2020, 1, 10, 12, 0))
                .build();

        Event event2 = Event.builder()
                .name("수학 스터디")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2020,1,17,10,0))
                .endDateTime(LocalDateTime.of(2020, 1, 17,12,0))
                .build();

        return List.of(event1, event2);

    }
}
