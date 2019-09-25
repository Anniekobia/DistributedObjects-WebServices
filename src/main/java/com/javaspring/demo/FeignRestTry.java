package com.javaspring.demo;

import com.javaspring.demo.spring.model.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "client", url = "http://10.51.10.111:2000")
public interface FeignRestTry {
//
//    @RequestMapping(method = RequestMethod.GET,value = "lecturers")
//    List<Teacher> getLecturers();
//
//    @RequestMapping(method = RequestMethod.POST, value = "students")
//    Student registerStudent(@RequestBody Student student);
//
//    @RequestMapping(method = RequestMethod.GET, value = "students/")
//    Student viewRegisteredStudent(@RequestParam(value="studentNumber") String studentNUmber);
//
//    @RequestMapping(method = RequestMethod.POST,value = "appointments")
//    Appointment createAppointment(@RequestBody LecturerStudentAppointment lecturerStudentAppointment);
//
//    @RequestMapping(method = RequestMethod.PATCH,value = "appointments/{appointmentId}/")
//    Appointment confirmAppointment(@PathVariable(name = "appointmentId")Long id,@RequestParam(value = "studentId") Long studentId);

    @RequestMapping(method = RequestMethod.POST,value = "students")
    Student register(@RequestBody StudentDetails studentDetails);

    @RequestMapping(method = RequestMethod.POST,value = "companies/{companyId}/attachments")
    Attachment requestAttachment(@PathVariable(name = "companyId") Long companyId,@RequestParam(value = "studentId") Long studentId);

    @RequestMapping(method = RequestMethod.PATCH,value = "companies/{companyId}/attachments")
    Attachment requestDepartment(@PathVariable(name = "companyId") Long companyId,@RequestParam(value = "studentId") Long studentId,@RequestParam(value = "departmentId") Long departmentId);

    @RequestMapping(method = RequestMethod.DELETE,value = "departments")
    Void response(@RequestBody CompanyReject companyReject);
}
