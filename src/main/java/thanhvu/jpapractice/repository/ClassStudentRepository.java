package thanhvu.jpapractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thanhvu.jpapractice.entity.ClassStudent;

public interface ClassStudentRepository extends JpaRepository<ClassStudent, Long> {
}
