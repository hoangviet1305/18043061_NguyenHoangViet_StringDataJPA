package service;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

import java.util.List;
@Service
public class StudentServiceImp implements StudenService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student Save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> GetAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student GetById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void DeleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student UpdateById(Long id, Student student) {
        Student s = studentRepository.findById(id).get();
        return studentRepository.save(s);
    }
}
