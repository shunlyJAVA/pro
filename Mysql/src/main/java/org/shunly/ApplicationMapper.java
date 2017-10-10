package org.shunly;

import java.util.List;

public interface ApplicationMapper {

		public void insert(Application a);
		
		public int delete(int id);
		
		public void update(Application a);
		
		public Application getById(int id);
		
		public List<Application> getByName(String name);
		
		public List<Application> listApplication();
}
