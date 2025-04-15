package com.attendance.system.attendance_system.controller;

import com.attendance.system.attendance_system.model.Attendance;
import com.attendance.system.attendance_system.model.User;
import com.attendance.system.attendance_system.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping
    public List<Attendance> getAttendanceByUserAndDate(@RequestParam Long userId, @RequestParam String date) {
        User user = new User();
        user.setId(userId);
        return attendanceService.getAttendanceByUserAndDate(user, LocalDate.parse(date));
    }

    @PostMapping
    public Attendance markAttendance(@RequestBody Attendance attendance) {
        return attendanceService.saveAttendance(attendance);
    }
}
