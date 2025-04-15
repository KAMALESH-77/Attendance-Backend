package com.attendance.system.attendance_system.service;

import com.attendance.system.attendance_system.model.Attendance;
import com.attendance.system.attendance_system.model.User;
import com.attendance.system.attendance_system.repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    public List<Attendance> getAttendanceByUserAndDate(User user, LocalDate date) {
        return attendanceRepository.findByUserAndDate(user, date);
    }

    public Attendance saveAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }
}
