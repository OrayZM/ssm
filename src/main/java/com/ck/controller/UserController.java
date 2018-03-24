package com.ck.controller;

import java.io.File;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import com.ck.model.*;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ck.services.UserServices;

@Controller  
@RequestMapping("/user")  
public class UserController {  
	
	private Logger logger = Logger.getLogger(UserController.class);
    @Resource  
    private UserServices userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model) throws Exception{  
    	String password=request.getParameter("password");
    	String username=request.getParameter("username");
    	int age=Integer.parseInt( request.getParameter("age"));
    	User user=new User(username, password, age);
    	System.out.println("password:"+password+"username:"+username+"age:"+age);
    	int a= this.userService.insertUser(user);
    	model.addAttribute("a",user);
      //  int userId = Integer.parseInt(request.getParameter("id"));  
       // User user = this.userService.getUser(userId);  
       // model.addAttribute("user", user); 
       // File file = new File("C:\\test.txt");
       // boolean b =file.createNewFile();
       // logger.error((user.getUserName()));
        return "showUser";  
    }
}