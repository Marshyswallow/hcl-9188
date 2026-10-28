package com.abes.hrmsdatabase.service;

import com.abes.hrmsdatabase.model.Attendance;
import com.abes.hrmsdatabase.model.Employee;
import com.abes.hrmsdatabase.repository.AttendanceRepository;
import com.abes.hrmsdatabase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class AttendanceService {
    @Autowired
    private AttendanceRepository attendanceRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public String markAttendance(Attendance attendance) {
        if (attendance.getEmployee() == null) {
            return "Employee Not Found";
        }
        Long emp_id = attendance.getEmployee().getId();
        if (employeeRepository.existsById(emp_id)) {
            boolean attendanceMarked =
                    attendanceRepository.existsByEmployee_IdAndAttendance(
                            emp_id, LocalDate.now());

            if (!attendanceMarked) {
                attendance.setAttendancedate(LocalDate.now());
                attendance.setInTime(java.time.LocalDateTime.now());
                attendance.setOutTime(null);

                attendanceRepository.save(attendance);

                return "Attendance marked successfully";
            } else {
                return "Attendance already marked";
            }
        }
        return "Employee doesn't exist";
    }

    public List<Attendance> getAllAttendance(){
        return attendanceRepository.findAll();
    }

    public String markOutTime(Long empId){
        Optional<Attendance> attendanceOpt= attendanceRepository.findByEmployee_IdAndAttendance(empId,LocalDate.now());
        if(attendanceOpt.isPresent()){
            Attendance attendance=attendanceOpt.get();
            attendance.setOutTime(LocalDateTime.now());
            attendanceRepository.save(attendance);
            return "Out time marked successfully";
        }
        return "Attendance not found for today";
    }
}
