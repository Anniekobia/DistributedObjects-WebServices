package com.javaspring.demo.spring;

import com.javaspring.demo.FeignRestTry;
import com.javaspring.demo.spring.model.Appointment;
import com.javaspring.demo.spring.model.Lecturer;
import com.javaspring.demo.spring.model.LecturerStudentAppointment;
import com.javaspring.demo.spring.model.Student;
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

        List <Lecturer> lecturersList = feignRestTry.getLecturers();
        System.err.println(lecturersList.toString());

        Student student = new Student("Bernice","94867");
        student = feignRestTry.registerStudent(student);
        System.out.println(student.toString());

        String studentNumber = student.getStudentNumber();
        Student registeredStudent = feignRestTry.viewRegisteredStudent(studentNumber);
        System.err.println(registeredStudent.toString());

        LecturerStudentAppointment lecturerStudentAppointment = new LecturerStudentAppointment("5","2");
        Appointment appointment = feignRestTry.createAppointment(lecturerStudentAppointment);
        System.out.println(appointment.getStudent().toString()+"\n"+ appointment.getLecturer()+"\n"+appointment.getConfirmed());
    }
}
