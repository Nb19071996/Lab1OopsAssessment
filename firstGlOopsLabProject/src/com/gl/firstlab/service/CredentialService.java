package com.gl.firstlab.service;

import java.util.Random;

import com.gl.firstlab.employee.Employee;

public class CredentialService {
	String department;
	Employee employee;
	
	public String generateEmailAddress(String department, Employee employee) {
		String email = employee.getFirstName()+""+employee.getLastName()+"@"+department+".XYZ.com";
		
		return email;
	}
	
	public String generatePassword() {
		String password = "";
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "1234567890";
		String splChar = "!@#$%^&*";
		Random random = new Random();
		
		password += caps.charAt(random.nextInt(caps.length()));
		password += caps.charAt(random.nextInt(caps.length()));
		password += lower.charAt(random.nextInt(lower.length()));
		password += lower.charAt(random.nextInt(lower.length()));
		password += num.charAt(random.nextInt(num.length()));
		password += num.charAt(random.nextInt(num.length()));
		password += splChar.charAt(random.nextInt(splChar.length()));
		password += splChar.charAt(random.nextInt(splChar.length()));
		
		return password;
	}
	
	
	public void showCredentials(String department, Employee employee) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email ---->"+generateEmailAddress(department,employee));
		System.out.println("Password ---->"+generatePassword());
		
	}

}
