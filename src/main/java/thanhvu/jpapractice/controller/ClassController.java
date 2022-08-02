package thanhvu.jpapractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import thanhvu.jpapractice.entity.ClassStudent;
import thanhvu.jpapractice.entity.Student;
import thanhvu.jpapractice.service.ClassStudentService;

import java.util.HashSet;
import java.util.Set;

public class ClassController {

    private ClassStudentService classStudentService;

    @Autowired
    public ClassController(ClassStudentService classStudentService) {
        this.classStudentService = classStudentService;
    }

    @PostMapping("/add")
    public void addClass() {
        Student student1 = new Student("Tuấn");
        Student student2 = new Student("Hải");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);

        ClassStudent classStudent = new ClassStudent();
        classStudent.setStudents(students);
        student1.setClassS(classStudent);
        student2.setClassS(classStudent);

        classStudentService.add(classStudent);
    }

    @GetMapping("/get/{id}")
    public ClassStudent getClass(@PathVariable Long id) {
        return this.classStudentService.findById(id);
    }
}
