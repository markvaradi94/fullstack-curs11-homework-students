package ro.fasttrackit.curs11.homework.students.model.mappers;

import org.springframework.stereotype.Component;
import ro.fasttrackit.curs11.homework.students.model.api.Student;
import ro.fasttrackit.curs11.homework.students.model.entity.StudentEntity;

@Component
public class StudentMapper implements Mapper<Student, StudentEntity> {
    @Override
    public Student toApi(StudentEntity source) {
        if (source == null) {
            return null;
        }

        var target = new Student();
        target.setId(source.getId());
        target.setName(source.getName());
        target.setAge(source.getAge());

        return target;
    }

    @Override
    public StudentEntity toEntity(Student source) {
        if (source == null) {
            return null;
        }

        var target = new StudentEntity();
        target.setId(source.getId());
        target.setName(source.getName());
        target.setAge(source.getAge());

        return target;
    }
}
