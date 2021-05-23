package ro.fasttrackit.curs11.homework.students.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ro.fasttrackit.curs11.homework.students.model.entity.StudentEntity;

public interface StudentRepository extends MongoRepository<StudentEntity, String> {
}
