package ro.fasttrackit.curs11.homework.students.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Builder
@Document(collection = "students")
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    @Id
    private String id;

    @NotNull
    private String name;

    @NotNull
    private Integer age;
}
