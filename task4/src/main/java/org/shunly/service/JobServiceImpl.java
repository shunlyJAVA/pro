package org.shunly.service;

import org.shunly.dao.JobMapper;
import org.shunly.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired(required = false)
    JobMapper jobMapper;

    public List<Job> listJob(int type) {
        return jobMapper.listJob(type);
    }
}
