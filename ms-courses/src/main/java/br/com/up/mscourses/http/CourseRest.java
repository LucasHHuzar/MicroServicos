package br.com.up.mscourses.http;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseRest {

    List<Course> courses =List.of(
            new Course(1, "Direito"),
            new Course(2, "Análise e Desenvolvimento de Sistemas"),
            new Course(3, "Arquitetura")
    );

    @GetMapping
    public List<Course> listAll(){
        return courses;
    }

    @GetMapping("/{id}")
    public Course findById(@PathVariable Integer id){
        var course = courses.stream().filter( c -> c.getId() == id).findFirst().orElse(null);
        return course;
    }

}
