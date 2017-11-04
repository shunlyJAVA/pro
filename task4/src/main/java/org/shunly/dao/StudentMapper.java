package org.shunly.dao;

import org.shunly.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    //输入报名信息
    void insert(Student student);

    //输入学员工作情况
    void insertWork(Student student);

    int delete(int id);

    void update(Student student);

    Student selectById(int id);

    //查询结业人数
    int selectByCompletion();

    //查询总人数
    int selectAll();

    //列出结业学生
    List<Student> listCompletion();

    List<Student> listStudent();
}
