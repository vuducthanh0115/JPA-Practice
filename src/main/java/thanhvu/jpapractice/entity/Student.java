package thanhvu.jpapractice.entity;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false, foreignKey = @ForeignKey(name = "class_id"))
    private ClassStudent classStudent;

    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }

    public Student(Long id, String name, ClassStudent classS) {
        this.id = id;
        this.name = name;
        this.classStudent = classS;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassStudent getClassS() {
        return classStudent;
    }

    public void setClassS(ClassStudent classStudent) {
        this.classStudent = classStudent;
    }
}
