package org.shunly;

import java.util.List;

import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@Autowired
	public static ApplicationMapper applicationMapper;
	
	@BeforeClass 
	public static void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Springconfig.xml");
		applicationMapper = (ApplicationMapper) context.getBean("applicationMapper");
	}
	@org.junit.Test
	public void getByIdTest() {
		Application app = new Application();
		app=applicationMapper.getById(1);
		System.out.println(app);
		
		
	}
	@org.junit.Test
	public void getByNameTest() {
		List<Application> app = applicationMapper.getByName("2");
		System.out.println(app);
		for(Application a :app)
		{
			System.out.println(a);
		}
	}
	
	@org.junit.Test
	public void insertTest() {
		int n = 12;
		Application app = new Application("s2",2222,"java",1999999,"daxue 2",2966,"#","dqdq","ni","da");
		applicationMapper.insert(app);
		System.out.println(applicationMapper.getById(n).toString());
	}

	@org.junit.Test
	public void listTest() {
		List<Application> app = applicationMapper.listApplication();
		for(Application a : app)
		{
			System.out.println(a);
		}
	}
}
