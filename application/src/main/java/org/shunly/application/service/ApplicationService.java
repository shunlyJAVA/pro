package org.shunly.application.service;

import org.shunly.application.entity.Application;

import java.util.List;

public interface ApplicationService {

    /**
     * 插入数据
     * @param a 报名信息
     * @return id
     */
    int insert(Application a);

    /**
     * 删除数据
     * @param id id
     * @return id
     */
    int delete(int id);

    /**
     * 更新数据
     * @param a 报名信息
     */
    void update(Application a);

    /**
     * id查找报名信息
     * @param id
     * @return 该信息
     */
    Application getById(int id);

    /**
     * 姓名查找报名信息
     * @param name 姓名
     * @return 报名信息
     */
    Application getByName(String name);

    /**
     * 显示所有报名信息
     * @return all
     */
    List<Application> listApplication();
}
