package com.example.accolite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.accolite.model.logIn;
import com.example.accolite.repository.logInRepo;

@CrossOrigin(origins="http://localhost:4200")
@RestController

public class logInController {

	@GetMapping("/home")
	public String home()
	{
		return "cvbnm,";
	}
	
	@Autowired
	logInRepo repo;
	
	@PostMapping("/login")
	
	public logIn adduser(@RequestBody logIn s1)
	{
//		String mail=s1.getMail();
//		System.out.println(mail);
			return repo.save(s1);
	}
	@GetMapping("/login")
	
	public List<logIn> get()
	{
		return repo.findAll();
	}

	//@CrossOrigin(origins="http://localhost:4200")
//	@PostMapping("/")
//		public ResponseEntity<logIn> loginuser(@RequestBody logIn logindata )
//		{
//			logIn login=repo.findByMail(logindata.getMail());
//			if(login.getPassword().equals(logindata.getPassword()))
//					{
//				return ResponseEntity.ok(login); 
//					}
//			return null;
//		} 
//	}
	@PostMapping("/loginuser")
	@CrossOrigin(origins="http://localhost:4200/login")
//
//	public ResponseEntity<logIn> loginuser(@RequestBody logIn logindata ) throws Exception
//	{
//		String mail=logindata.getMail();
//		String pass=logindata.getPassword();
//		logIn login=null;
//		if(mail!=null && pass!=null)
//		{
//		login=repo.findByMailAndPassword(mail,pass);	
//	}
//		if(login==null)
//		{
//			throw new Exception("user does not exist");
//		}
//		return ResponseEntity.ok(login);
//	} 
	
	public logIn logindata(@RequestBody logIn logindata ) throws Exception
	{
		String mail=logindata.getMail();
		String pass=logindata.getPassword();
		logIn login=null;
		if(mail!=null && pass!=null)
		{
		login=repo.findByMailAndPassword(mail,pass);	
	}
		if(login==null)
		{
			throw new Exception("user does not exist");
		}
		return login;
	} 
}


//	logIn login=repo.findByMail("neha@accolitedigital.com");

	

