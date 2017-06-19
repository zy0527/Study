package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.ui.Model;

import model.UserInfo;

public class SqlServerUser implements IUser {

	@Override
	public int Get(Model model) {
		
		model.addAttribute("text","sss");
		Configuration cfg = new Configuration().configure();  
	     SessionFactory factory = cfg.buildSessionFactory();   
	     Session session = null; 
		try {
		     session = factory.openSession();  
	         //开启事务  
	         session.beginTransaction();  
	         
	         UserInfo user = new UserInfo();
	         user.setId("1");
	         user.setUsername("xxx");   
	         user.setPassword("123");
	         session.save(user);
	         
	        
	         //提交事务  
	         session.getTransaction().commit();  
		} finally{
			if(session!=null)
			 session.close();  
		}
		return 1;
	}

}
