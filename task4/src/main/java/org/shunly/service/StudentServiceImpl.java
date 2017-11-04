package org.shunly.service;

import org.shunly.dao.StudentMapper;
import org.shunly.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired(required = false)
    StudentMapper studentMapper;


    public int insert(Student student) {
        studentMapper.insert(student);
        return student.getId();
    }

    public int delete(int id) {
        studentMapper.delete(id);
        return id;
    }

    public void update(Student student) {
        studentMapper.update(student);
    }

    public Student getById(int id) {

        return studentMapper.selectById(id);
    }

    public int countCompletion() {
        return studentMapper.selectByCompletion();
    }

    public int countAll() {
        return studentMapper.selectAll();
    }

    public List<Student> listCompletion(){
        return studentMapper.listCompletion();
    }

    public List<Student> listStudent() {
        return studentMapper.listStudent();
    }
}
