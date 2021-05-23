package ro.fasttrackit.curs11.homework.students.bootstrap;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ro.fasttrackit.curs11.homework.students.service.StudentService;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    private final StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
//        studentService.addStudent(StudentEntity.builder()
//                .name("Gigi")
//                .age(24)
//                .build()
//        );
    }
}
