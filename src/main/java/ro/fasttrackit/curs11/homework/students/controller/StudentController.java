package ro.fasttrackit.curs11.homework.students.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.curs11.homework.students.exceptions.StudentNotFoundException;
import ro.fasttrackit.curs11.homework.students.model.api.Student;
import ro.fasttrackit.curs11.homework.students.model.filters.StudentFilters;
import ro.fasttrackit.curs11.homework.students.model.mappers.StudentMapper;
import ro.fasttrackit.curs11.homework.students.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;
    private final StudentMapper mapper;

    @GetMapping
    List<Student> getAll(StudentFilters filters) {
        return mapper.toApi(service.findAll(filters));
    }

    @GetMapping("{studentId}")
    Student findById(@PathVariable String studentId) {
        return mapper.toApi(
                service.findById(studentId)
                        .orElseThrow(() -> new StudentNotFoundException("Could not find student"))
        );
    }

    @PostMapping
    Student addStudent(@RequestBody Student student) {
        return mapper.toApi(
                service.addStudent(mapper.toEntity(student))
        );
    }
}
