package com.example.timetrackerbackend;

import org.springframework.data.repository.CrudRepository;

public interface TimeEntryRepository extends CrudRepository<TimeEntry, Integer> {
}
