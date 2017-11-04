package org.shunly.service;

import org.shunly.entity.Job;

import java.util.List;

public interface JobService {

    /**
     * 查询不同的职业，参数1为前端，2为后端
     * @param type
     * @return
     */
    List<Job> listJob(int type);


}
