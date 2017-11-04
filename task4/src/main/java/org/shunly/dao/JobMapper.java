package org.shunly.dao;

import org.shunly.entity.Job;

import java.util.List;

public interface JobMapper {


    void insert(Job job);

    int delete(int id);

    void update(Job job);

    Job selectById(int id);

    /**
     * 查询不同类型的职业
     * @param type 职业类型 1前端 2后端
     * @return
     */
    List<Job> listJob(int type);

}
