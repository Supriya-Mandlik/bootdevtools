package com.example.bootdevtools;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a=100;
		int b=100;
		int c=100;
		int d=100;
		return "this is just testing sum of a and b is "+(a+b+c+d);
	}

}
