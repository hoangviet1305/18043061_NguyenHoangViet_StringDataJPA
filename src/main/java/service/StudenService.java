package service;

import entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudenService {
    public Student Save(Student student);
    public List<Student> GetAll();
    public Student GetById(Long id);
    public void DeleteById(Long id);
    public Student UpdateById(Long id, Student student);
}

