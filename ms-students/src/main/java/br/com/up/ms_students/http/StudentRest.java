package br.com.up.ms_students.http;

import br.com.up.ms_students.config.CourseOpenFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRest {

    @Autowired
    CourseOpenFeign courseOpenFeign;

    List<Student> students =List.of(
        new Student(1, "Rhafael"),
        new Student(2, "Lucas"),
        new Student(3, "José"),
        new Student(4, "Maria"),
        new Student(5, "Antonio")
    );

    @GetMapping
    public List<Student> allStudents(){

        List<Course> courses = courseOpenFeign.listAll();

        System.out.println("LISTA DE CURSOS");

        courses.forEach( c -> {

            System.out.println(c.getName());

        });

        return students;
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Integer id){
        return students.get(id);
    }

}
