package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("testAjax/{id}/{name}")
	@ResponseBody
	public String test(@PathVariable int id,@PathVariable String name){
		System.out.println(id+"=============="+name);
		return "{\"result\":\"success\"}";
	}
}
