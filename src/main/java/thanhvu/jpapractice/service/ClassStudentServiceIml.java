package thanhvu.jpapractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thanhvu.jpapractice.entity.ClassStudent;
import thanhvu.jpapractice.repository.ClassStudentRepository;

import java.util.List;
import java.util.Optional;

@Service
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
    public void delete(long id) {
        classStudentRepository.deleteById( id);
    }


    @Override
    public ClassStudent findById(Long id) {
        return this.classStudentRepository.findById(id).orElse(null);
    }

    @Override
    public List<ClassStudent> findAllClass() {
        return classStudentRepository.findAll();
    }

}
