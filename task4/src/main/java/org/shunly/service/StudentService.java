package org.shunly.service;

import org.shunly.entity.Student;

import java.util.List;

public interface StudentService {

    int insert(Student student);

    int delete(int id);

    void update(Student student);

    Student getById(int id);

    int countCompletion();

    int countAll();

    List<Student> listCompletion();

    List<Student> listStudent();
}
