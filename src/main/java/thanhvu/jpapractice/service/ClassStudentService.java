package thanhvu.jpapractice.service;

import thanhvu.jpapractice.entity.ClassStudent;

import java.util.List;
import java.util.Optional;

public interface ClassStudentService {
    void add(ClassStudent classStudent);
    void delete(long id);
    ClassStudent findById(Long id);

    List<ClassStudent> findAllClass();
}
