package thanhvu.jpapractice.service;

import thanhvu.jpapractice.entity.ClassStudent;

public interface ClassStudentService {
    void add(ClassStudent classStudent);
    ClassStudent findById(Long id);
}
