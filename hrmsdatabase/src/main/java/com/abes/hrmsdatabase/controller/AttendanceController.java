package com.abes.hrmsdatabase.controller;

import com.abes.hrmsdatabase.model.Attendance;
import com.abes.hrmsdatabase.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/v1/user/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/mark")
    public ResponseEntity<String> markAttendance(@RequestBody Attendance attendance){
        System.out.println(attendance.getInTime());
        String result = attendanceService.markAttendance(attendance);
        if(result.equals("Attendance marked successfully")){
            return ResponseEntity.ok(result);
        }
        if(result.equals("Attendance already marked")) return ResponseEntity.status(HttpStatus.CONFLICT).body(result);

        if(result.equals("Employee doesn't exist")) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(result);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

    @GetMapping("/all")
    public List<Attendance> getAllAttendance() {
        return attendanceService.getAllAttendance();
    }

    @PutMapping("/markOut")
    public ResponseEntity<String> markOutAttendance(@RequestParam Long empId){
        String result=attendanceService.markOutTime(empId);

        if(result.equals("Out time marked successfully")) return ResponseEntity.ok(result);
        if(result.equals("Attendance not found for today")) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(result);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }


}
