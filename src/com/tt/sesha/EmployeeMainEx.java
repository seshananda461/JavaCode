package com.tt.sesha;

import java.util.Comparator;




import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMainEx {
	
	public static void main(String [] args) {
		EmployeeEx e1 = new EmployeeEx(100,"sesha",30000,"TrendingTech");
		EmployeeEx e2 = new EmployeeEx(101,"jagadeesh",33000,"TrendingTech");
		EmployeeEx e3 = new EmployeeEx(102,"Abhi",43000,"TrendingTech");
		EmployeeEx e4 = new EmployeeEx(103,"jyothi",50000,"TrendingTech");
		EmployeeEx e5 = new EmployeeEx(104,"ramireddy",53000,"TrendingTech");
		
		List<EmployeeEx> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		Collections.sort(list,(o1,o2)-> o1.getEmpName().compareTo(o2.getEmpName()));

			
		
		
		for(EmployeeEx emp : list) {
			System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.EmpSalary+" "+emp.getEmpCompany());
		}
		
		System.out.println("---------------------------------");
		
		Collections.sort(list,(o1,o2)-> o1.getEmpSalary().compareTo(o2.getEmpSalary()));
			
		for(EmployeeEx emp : list) {
			System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.EmpSalary+" "+emp.getEmpCompany());
		}
		
	}



	
}
