package cn.tedu.demo.controller;
import java.io.File;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/test/test")
	public String test() {
		File file=new File("/usr/local/images/aaa.txt");
		
		if (!file.getParentFile().exists()) {
			System.out.println("---------------------------创建文件夹-------------------------------------------");
			file.getParentFile().mkdirs();
		}
		
		
		System.out.println("---------------------------结束-------------------------------------------");
		
		return "fail";
	}
}
