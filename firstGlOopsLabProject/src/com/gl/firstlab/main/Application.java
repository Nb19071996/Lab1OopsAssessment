package com.gl.firstlab.main;

import java.util.Scanner;

import com.gl.firstlab.employee.Employee;
import com.gl.firstlab.service.CredentialService;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int deptNo;
		String email;
		String password;
		Employee employee = new Employee("Nikita", "Bhoyar");
		CredentialService credentailService = new CredentialService();

		System.out.println("Welcome to the XYZ company");
		System.out.println();
		System.out.println("Please enter the department from the following");

		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		deptNo = sc.nextInt();
		switch (deptNo){

			case 1: {
	
				credentailService.showCredentials("tech",employee);
	
				break;
			}
	
			case 2: {
				credentailService.showCredentials("admin",employee);
	
				break;
			}
	
			case 3: {
				credentailService.showCredentials("hr",employee);
	
				break;
			}
	
			case 4: {
				credentailService.showCredentials("legal",employee);
	
				break;
			}
	
			default:{
				System.out.println("please give valid option.....");
			} 

		}

	}

}
