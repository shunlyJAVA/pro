package org.shunly.application.serviceImp;

import org.shunly.application.dao.ApplicationMapper;
import org.shunly.application.entity.Application;
import org.shunly.application.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImp implements ApplicationService{

    @Autowired(required = false)
    ApplicationMapper applicationMapper;

    public int insert(Application a) {
        applicationMapper.insert(a);
        return a.getId();
    }

    public int delete(int id) {
        applicationMapper.delete(id);
        return id;
    }

    public void update(Application a) {
        applicationMapper.update(a);
    }

    public Application getById(int id) {
        return applicationMapper.getById(id);
    }

    public Application getByName(String name) {
        return applicationMapper.getByName(name);
    }

    public List<Application> listApplication() {
        return applicationMapper.listApplication();
    }
}
