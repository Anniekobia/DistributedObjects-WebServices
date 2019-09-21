package com.javaspring.demo;

import com.javaspring.demo.spring.model.Appointment;
import com.javaspring.demo.spring.model.LecturerStudentAppointment;
import com.javaspring.demo.spring.model.Student;
import com.javaspring.demo.spring.model.Lecturer;
import feign.Body;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "client", url = "http://localhost:1000")
public interface FeignRestTry {

    @RequestMapping(method = RequestMethod.GET,value = "lecturers")
    List<Lecturer> getLecturers();

    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student registerStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.GET, value = "students/")
    Student viewRegisteredStudent(@RequestParam(value="studentNumber") String studentNUmber);

    @RequestMapping(method = RequestMethod.POST,value = "appointments")
    Appointment createAppointment(@RequestBody LecturerStudentAppointment lecturerStudentAppointment);

}
