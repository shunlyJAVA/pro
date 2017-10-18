package org.shunly.application.dao;

import org.shunly.application.entity.Application;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationMapper {

    void insert(Application a);

    int delete(int id);

    void update(Application a);

    Application getById(int id);

    Application getByName(String name);

    List<Application> listApplication();
}
