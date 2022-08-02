package thanhvu.jpapractice.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "class")
public class ClassStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long classId;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "classStudent")
    private Set<Student> students;

    public ClassStudent(Long classId, Set<Student> students) {
        this.classId = classId;
        this.students = students;
    }

    public ClassStudent() {
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
