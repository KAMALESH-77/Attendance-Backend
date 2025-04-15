package com.attendance.system.attendance_system.repository;

import com.attendance.system.attendance_system.model.Attendance;
import com.attendance.system.attendance_system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    List<Attendance> findByUserAndDate(User user, LocalDate date);
}
