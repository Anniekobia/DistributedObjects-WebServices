package com.javaspring.demo.spring;

import com.javaspring.demo.FeignRestTry;
import com.javaspring.demo.spring.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestingRest implements CommandLineRunner {

    //private final FeignRestClient feignRestClient;
    private final FeignRestTry feignRestTry;

    public TestingRest( FeignRestTry feignRestTry) {
        this.feignRestTry = feignRestTry;
    }

    @Override
    public void run(String... args) throws Exception {
//        RestTemplate restTemplate = new RestTemplate();
//
//        ResponseEntity<List<Movie>> response = restTemplate.exchange("http://10.51.10.111:9090/movies", HttpMethod.GET, null, new ParameterizedTypeReference<List<Movie>>() {
//        });
//        List<Movie> movies = response.getBody();
//        System.err.println(movies.toString());
//
//        Movie newMovie = new Movie("Why", "2019");
//        newMovie = feignRestClient.createMovie(newMovie);
//        System.out.println("Created Movie: " + newMovie.toString());
//
//        movies = feignRestClient.getAllMovies();
//        System.out.println(movies);
//
//        newMovie.setName("Why are you running");
//        newMovie = feignRestClient.updateMovie(newMovie.getId(),newMovie);
//        System.out.println("Updated Movie: " + newMovie.toString());
//
//        Movie movie = restTemplate.getForObject("http://10.51.10.111:9090/movies/3", Movie.class);
//        System.err.println(movie.toString());
//
//        String url = "http://10.51.10.111:9090/movies/search?name=" + movie.getName();
//        Movie movieByName = restTemplate.getForObject(url, Movie.class);
//        System.err.println(movieByName.toString());

//        List <Teacher> lecturersList = feignRestTry.getLecturers();
//        System.err.println(lecturersList.toString());
//
//        Student student = new Student("Bernice","94867");
//        student = feignRestTry.registerStudent(student);
//        System.out.println(student.toString());
//
//        String studentNumber = student.getStudentNumber();
//        Student registeredStudent = feignRestTry.viewRegisteredStudent(studentNumber);
//        System.err.println(registeredStudent.toString());
//
//        LecturerStudentAppointment lecturerStudentAppointment = new LecturerStudentAppointment("5","2");
//        Appointment appointment = feignRestTry.createAppointment(lecturerStudentAppointment);
//        System.out.println("Appointment ID:"+appointment.getId()+"\n"+appointment.getStudent().toString()+"\n"+ appointment.getTeacher()+"\n"+appointment.getConfirmed());
//
//        Appointment confirmedAppointment = feignRestTry.confirmAppointment(appointment.getId(),student.getId());
//        System.out.println("Appointment ID:"+confirmedAppointment.getId()+"\n"+confirmedAppointment.getStudent().toString()+"\n"+ confirmedAppointment.getTeacher()+"\n"+confirmedAppointment.getConfirmed());
//

        Student student = feignRestTry.register(new StudentDetails("Annunziata Kinya Kobia","094501"));
        System.err.println(student.toString());

        Attachment attachment =feignRestTry.requestAttachment(6L,student.getId());
        System.out.println("Everything"+attachment.toString()+"\nCompany"+attachment.getCompany().toString()+"\nDepartment"+attachment.getDepartment()+"\nRejected"+attachment.getRejected());

        Attachment departmentAttachment=feignRestTry.requestDepartment(6L,student.getId(),11L);
        System.err.println(departmentAttachment.toString());

        Void response = feignRestTry.response(new CompanyReject(49L,11L,6L));
        response.toString();

    }
}
