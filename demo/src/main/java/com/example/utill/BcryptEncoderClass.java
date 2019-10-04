package com.example.utill;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderClass extends BCryptPasswordEncoder{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String pass="password";
		
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
	System.out.println(bCryptPasswordEncoder.encode(pass));
		
	}
	
	
	

}
