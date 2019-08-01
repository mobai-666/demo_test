package com.lalala.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	// @Autowired
	// private StudentRepository studentRepository;
//	@Autowired
//	private JmsMessagingTemplate jmsTpl;
	@Autowired
	AmqpTemplate amqp;
	

	// @RequestMapping("/")
	// public String home(Model mo) {
	// List<Student> list = studentRepository.findSex("女");
	// mo.addAttribute("list", list);
	// System.out.println(mo.toString());
	// return "home";
	// }

	@RequestMapping("/")
	public String home() {
		return "home";

	}

//	@RequestMapping("/send")
//	@ResponseBody
//	public String send(String msg, HttpServletRequest req) {
//		String type = req.getHeader("X-Requested-With");
//		if (type == null) {
//			System.out.println("普通请求");
//		} else {
//			System.out.println(type + "--ajax请求");
//		}
//		System.out.println("-----------------send-----------" + msg);
//		jmsTpl.convertAndSend("testQP", msg);
//
//		return "success";
//
//	}

	@RequestMapping("/towee")
	public String towe() {
		return "we";

	}

	@RequestMapping("/towe")
	public String test(Model mo) {
		System.out.println("hello");
		String str = "hello";
		mo.addAttribute("str", str);
		System.out.println(mo.toString());
		return "we";
	}

	@RequestMapping("/amqp")
	public String amqp(String msg,HttpServletResponse r,HttpServletRequest t) throws ServletException, IOException {
		
		t.getRequestDispatcher("").forward(t,r);
		System.out.println(msg);
		amqp.convertAndSend("testAmq", msg);
		return "success";
		
	}

}
