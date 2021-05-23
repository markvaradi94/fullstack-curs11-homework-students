package ro.fasttrackit.curs11.homework.students.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.fasttrackit.curs11.homework.students.model.entity.StudentEntity;
import ro.fasttrackit.curs11.homework.students.model.filters.StudentFilters;
import ro.fasttrackit.curs11.homework.students.repository.StudentMongoDao;
import ro.fasttrackit.curs11.homework.students.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

import static java.util.Collections.unmodifiableList;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentMongoDao studentDao;
    private final StudentRepository studentRepository;

    public List<StudentEntity> findAll(StudentFilters filters) {
        return unmodifiableList(studentDao.findStudents(filters));
    }

    public StudentEntity addStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    public Optional<StudentEntity> findById(String studentId) {
        return studentRepository.findById(studentId);
    }
}
