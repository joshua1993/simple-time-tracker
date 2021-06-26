package com.example.timetrackerbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/timetrackerbackend/v1")
public class TimeController {
    @Autowired
    private TimeEntryRepository timeEntryRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewTimeEntry(@RequestParam String description, @RequestParam String time) {
        TimeEntry te = new TimeEntry();

        te.setDescription(description);
        te.setTime(time);
        timeEntryRepository.save(te);
        return "Time entry saved";
    }

    @GetMapping(path = "/allentries")
    public @ResponseBody
    Iterable<TimeEntry> getAllTimeEntries() {
        return timeEntryRepository.findAll();
    }
}
