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
				case 2:System.out.println("������Ҫɾ����id��");deleteById(sc.nextInt());break;
				case 3:applicationMapper.update(update());break;
				case 4:System.out.println("������Ҫ��ѯ��id��");selectById(sc.nextInt());break;
				case 5:System.out.println("������Ҫ��ѯ�����֣�");selectByName(sc.next());;break;
				case 0:System.out.println("�������");break;
				default:System.out.println("�����������������");break;
			
			}
		}while(n!=0);
		sc.close();
		
		
		
	}
	
	public static String mainmenu() { 
		return   "*****��ӭʹ�����ݿ����ϵͳ****\n"
				+"*********1 �����Ϣ************\n"
				+"*********2 ɾ����Ϣ************\n"
				+"*********3 ������Ϣ************\n"
				+"*********4 ͨ��id��ѯ��Ϣ******\n"
				+"*********5 ͨ��������ѯ��Ϣ****\n"
				+"*********0  �˳�ϵͳ************\n"
				+"*******************************\n"
				;
	}
	public static Application add() {
		Application app = new Application();			
		System.out.println("�����뱨�������Ϣ");
		System.out.println("������");app.setName(sc.next());
		System.out.println("qq��");app.setQq(sc.nextInt());
		System.out.println("�������ͣ�");app.setPosition(sc.next());
		System.out.println("��ѧʱ�䣺");app.setTime(sc.nextInt());
		System.out.println("��ҵѧУ��");app.setCollege(sc.next());
		System.out.println("����ѧ�ţ�");app.setOnlineId(sc.nextInt());
		System.out.println("�ձ����ӣ�");app.setUrl(sc.next());
		System.out.println("��Ը��");app.setAmbition(sc.next());
		System.out.println("ʦ�֣�");app.setSenior(sc.next());
		System.out.println("�Ӻδ��˽⣺");app.setInfo(sc.next());
		return app;
	}
	
	public static void deleteById(int id) {
		
		if(applicationMapper.getById(id)!=null) {
			applicationMapper.delete(id);
			System.out.println("��ɾ��");
		}
		else {
			System.out.println("δ��ѯ����id");
		}
	}
	
	public static Application update() {
		Application app = new Application();
		System.out.println("������Ҫ�޸ĵ�id��");app.setId(sc.nextInt());
		if(applicationMapper.getById(app.getId()) == null) {
			System.out.println("��idδ��ӣ�������Ӻ��ٸ���");
			return null;
		}
		else {
		System.out.println("������");app.setName(sc.next());
		System.out.println("qq��");app.setQq(sc.nextInt());
		System.out.println("�������ͣ�");app.setPosition(sc.next());
		System.out.println("��ѧʱ�䣺");app.setTime(sc.nextInt());
		System.out.println("��ҵѧУ��");app.setCollege(sc.next());
		System.out.println("����ѧ�ţ�");app.setOnlineId(sc.nextInt());
		System.out.println("�ձ����ӣ�");app.setUrl(sc.next());
		System.out.println("��Ը��");app.setAmbition(sc.next());
		System.out.println("ʦ�֣�");app.setSenior(sc.next());
		System.out.println("�Ӻδ��˽⣺");app.setInfo(sc.next());
		System.out.println("�����");
		return app;
		}
	}
	public static void selectById(int id) {
		Application app = applicationMapper.getById(id);
		if(app!=null) 
		System.out.println(app);
		else {
			System.out.println("δ��ѯ����id");
			
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
			System.out.println("δ��ѯ��������");
			return;
		}
	}
	

	
}
