import org.junit.Test;
import org.junit.runner.RunWith;
import org.shunly.application.entity.Application;
import org.shunly.application.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class ApplicationServiceTest {

    @Autowired
    private ApplicationService applicationService;
    @Test
    public void testGetById() throws Exception{
        System.out.println(applicationService.getById(1));
    }

    @Test
    public void testListApplication() throws Exception{
        List<Application> a = applicationService.listApplication();
        for(Application applications:a){
            System.out.println(applications);
        }
    }

}
