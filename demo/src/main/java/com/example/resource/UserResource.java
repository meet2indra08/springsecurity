package com.example.resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;import net.bytebuddy.build.ToStringPlugin.Exclude;


@RestController
public class UserResource {

	@RequestMapping("/sec/getName")
	public String getName() {
		System.out.println("######### My Name ###########");
		return "indra";
	}
	
	
	@RequestMapping("/sec/getId")
	public String getID()
	{
		System.out.println("######### My Id ###########");
		return "1";
	}
	
}
