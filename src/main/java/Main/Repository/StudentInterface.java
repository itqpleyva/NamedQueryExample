package Main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Main.Model.Student;

public interface StudentInterface extends JpaRepository<Student, Integer> {

}
