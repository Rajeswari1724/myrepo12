package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te.springmvc.bean.UserBean;

@Controller
public class SpringMVCController {
	@RequestMapping(path = "/home" , method = RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("homepage");
		return modelAndView;
	}
    
	@RequestMapping(path = "/home2" , method = RequestMethod.GET)
	public ModelAndView getHomePage2() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("second");
		return modelAndView;
	}
	
	@RequestMapping(path = "/search" , method = RequestMethod.GET)
	public ModelAndView getData(ModelAndView modelAndView,HttpServletRequest request) {
	    String name=request.getParameter("name");
		request.setAttribute("username", name);
	//	modelAndView.setViewName("/WEB-INF/views/newHome.jsp");
		modelAndView.setViewName("newHome");
		return modelAndView;
	}
	@GetMapping("/login")
	public String getForm() {
		return "loginForm";
		
	}
	@PostMapping("/login" )
	public String getData(HttpServletRequest request, ModelMap modelMap) {
		String name=request.getParameter("user");
		int password=Integer.parseInt(request.getParameter("pwd"));
		
		modelMap.addAttribute("name",name);
		modelMap.addAttribute("pwd",password);
       return "userDetails";
	}

	@PostMapping("/login1")
	public String name(ModelMap modelMap,int pwd,String user) {
		modelMap.addAttribute("name",user);
		modelMap.addAttribute("pwd",pwd);
        return "userDetails";
	}

	@PostMapping("/login2")
	public String getDataFormBean(UserBean userBean,ModelMap modelMap) {
				
		modelMap.addAttribute("name",userBean.getUser());
		modelMap.addAttribute("pwd",userBean.getPwd());
        return "userDetails";
	}

	@PostMapping("/login3")
	public String getFormRequestParam(ModelMap modelMap,
		@RequestParam(name="")String user,	
		@RequestParam(name = "pwd")int password){
			modelMap.addAttribute("name",user);
			modelMap.addAttribute("pwd",password);
	        return "userDetails";
	
		}
			}

	
	


