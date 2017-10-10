package org.shunly;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationService  {

	
	
	public static ApplicationContext context = new ClassPathXmlApplicationContext("Springconfig.xml");
	
	public static ApplicationMapper applicationMapper = (ApplicationMapper) context.getBean("applicationMapper");
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		do {
			System.out.println(mainmenu());
			n = sc.nextInt();
			switch (n) {
				case 1:applicationMapper.insert(add());break;
				case 2:System.out.println("请输入要删除的id：");deleteById(sc.nextInt());break;
				case 3:applicationMapper.update(update());break;
				case 4:System.out.println("请输入要查询的id：");selectById(sc.nextInt());break;
				case 5:System.out.println("请输入要查询的名字：");selectByName(sc.next());;break;
				case 0:System.out.println("程序结束");break;
				default:System.out.println("输入错误，请重新输入");break;
			
			}
		}while(n!=0);
		sc.close();
		
		
		
	}
	
	public static String mainmenu() { 
		return   "*****欢迎使用数据库管理系统****\n"
				+"*********1 添加信息************\n"
				+"*********2 删除信息************\n"
				+"*********3 更新信息************\n"
				+"*********4 通过id查询信息******\n"
				+"*********5 通过姓名查询信息****\n"
				+"*********0  退出系统************\n"
				+"*******************************\n"
				;
	}
	public static Application add() {
		Application app = new Application();			
		System.out.println("请输入报名相关信息");
		System.out.println("姓名：");app.setName(sc.next());
		System.out.println("qq：");app.setQq(sc.nextInt());
		System.out.println("修真类型：");app.setPosition(sc.next());
		System.out.println("入学时间：");app.setTime(sc.nextInt());
		System.out.println("毕业学校：");app.setCollege(sc.next());
		System.out.println("线上学号：");app.setOnlineId(sc.nextInt());
		System.out.println("日报链接：");app.setUrl(sc.next());
		System.out.println("立愿：");app.setAmbition(sc.next());
		System.out.println("师兄：");app.setSenior(sc.next());
		System.out.println("从何处了解：");app.setInfo(sc.next());
		return app;
	}
	
	public static void deleteById(int id) {
		
		if(applicationMapper.getById(id)!=null) {
			applicationMapper.delete(id);
			System.out.println("已删除");
		}
		else {
			System.out.println("未查询到此id");
		}
	}
	
	public static Application update() {
		Application app = new Application();
		System.out.println("请输入要修改的id：");app.setId(sc.nextInt());
		if(applicationMapper.getById(app.getId()) == null) {
			System.out.println("此id未添加，请先添加后再更新");
			return null;
		}
		else {
		System.out.println("姓名：");app.setName(sc.next());
		System.out.println("qq：");app.setQq(sc.nextInt());
		System.out.println("修真类型：");app.setPosition(sc.next());
		System.out.println("入学时间：");app.setTime(sc.nextInt());
		System.out.println("毕业学校：");app.setCollege(sc.next());
		System.out.println("线上学号：");app.setOnlineId(sc.nextInt());
		System.out.println("日报链接：");app.setUrl(sc.next());
		System.out.println("立愿：");app.setAmbition(sc.next());
		System.out.println("师兄：");app.setSenior(sc.next());
		System.out.println("从何处了解：");app.setInfo(sc.next());
		System.out.println("已添加");
		return app;
		}
	}
	public static void selectById(int id) {
		Application app = applicationMapper.getById(id);
		if(app!=null) 
		System.out.println(app);
		else {
			System.out.println("未查询到此id");
			
		}
	}
	
	public static void selectByName(String name) {
		List<Application> app = applicationMapper.getByName(name);
		if(!app.isEmpty()) {
			for(Application a:app) {
				System.out.println(a);
			}
		}
		else {
			System.out.println("未查询到此名字");
			return;
		}
	}
	

	
}
