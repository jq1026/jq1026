package com.zks.controller;

import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zks.model.User;
import com.zks.service.UserService;

@Controller
@RequestMapping("/sys")
public class UserController {
	@Autowired
	 private UserService userService;
	 
	@RequestMapping("/login")
	 public String login(Model model,User users){
		/*System.out.println(name+"  "+password);*/
		users=userService.getu(users.getName(), users.getPassword());
		if(users!=null){
			model.addAttribute("users",users);
			return "redirect:/sys/showuser";
		}else{
			model.addAttribute("users", "用户名密码不符，登录失败！");
			 return "/login";
		}
		/*boolean result;
		if(username.equals(password)){
			result = true;
		}else{
			result = false;
		}
		//boolean result  = userService.login(username, password);
		 if(result){
			
			 return "redirect:/sys/showuser";
		 }else{
			 model.addAttribute("result", "用户名密码不符，登录失败！");
			 return "/login";
		 }*/
		//return "df";
	 }
	  @RequestMapping("/showuser")
	    public String showPersons(Model model){
	        List<User> users = userService.queryAll();
	        model.addAttribute("users", users);
	        System.out.println(users.size());
	        
	        return "/index";
	    }
	  @RequestMapping("/add")
	  	/*public String adduser(Model mo,@RequestParam(value="uid", required=true)long uid,@RequestParam(value="name", required=true)String name,@RequestParam(value="password", required=true)String password){
		  user=userService.adduser(user.getId(), user.getName(), user.getPassword()); 
		 userService.adduser(uid,name,password);
		  
		  JOptionPane.showMessageDialog(null,"添加成功！","提示",JOptionPane.CANCEL_OPTION);
		  return "redirect:/sys/showuser";
	  }*/
	  public String adduser2(Model mo,User user){
		  userService.adduser2(user);
		  JOptionPane.showMessageDialog(null, "添加成功","提示",JOptionPane.CANCEL_OPTION);
		  return "redirect:/sys/showuser";
	  }
	  
	  @RequestMapping("/delete")
	  	public String delete(Model mo,@RequestParam(value="uid", required=true)int uid){
		  userService.delete(uid);
		  return "redirect:/sys/showuser";
	  }
	  
	  @RequestMapping("/getone")
	  public String getone(Model mo,@RequestParam(value="name", required=true)String name){
		  User user=userService.getone(name);
		  mo.addAttribute("user",user);
		  return "/update";
	  }
	  
	  @RequestMapping("/update")
	  public String getone(Model mo,User user){
		 userService.update(user);
		 return "redirect:/sys/showuser";
	  }
	  
	  @RequestMapping("/addt")
	  	public String addt(){
		  return "/add";
	  } 
	  
}
