package thanhvu.jpapractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import thanhvu.jpapractice.entity.ClassStudent;
import thanhvu.jpapractice.repository.ClassStudentRepository;

public class ClassStudentServiceIml implements ClassStudentService {

    private ClassStudentRepository classStudentRepository;

    @Autowired
    public ClassStudentServiceIml(ClassStudentRepository classStudentRepository) {
        this.classStudentRepository = classStudentRepository;
    }

    @Override
    public void add(ClassStudent classStudent) {
        this.classStudentRepository.save(classStudent);
    }

    @Override
    public ClassStudent findById(Long id) {
        return this.classStudentRepository.findById(id).orElse(null);
    }
}
