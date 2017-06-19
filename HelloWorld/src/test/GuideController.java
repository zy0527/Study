package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.IUser;

@Controller
public class GuideController {

	 @Autowired  
	private IUser user;  
    int i;
	
    /*
    public void setSpringDao(IUser user) {  
    	this.user = user;  
    }  
    */
    
    
	@SuppressWarnings({ "unused", "resource" })
	@RequestMapping({"user"})
	public String test1(Model model){
		
		ApplicationContext context = new ClassPathXmlApplicationContext(     
		        "spring.xml");  
		i=user.Get(model);
		
		if(i==1){
		 return "sqlServer";
		}
		else if(i==2){
			return "oracle";
		}
		else {
			return "error";
		}
		
	}
	
	
	
	@RequestMapping({"test"})
	public String test(){
		return "test";
	}
	
	@RequestMapping({"/Welcome"})
	public String testWelcome(){
		return "test1";
	}
}
