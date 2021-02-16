package com.tt.sesha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentMain {
 
	public static void main(String [] args) {
		StudentEx stu1 = new StudentEx(100,"Seshananda","y",1);
		StudentEx stu2 = new StudentEx(101,"Santhosh","p",5);
		StudentEx stu3 = new StudentEx(102,"Mohan","g",6);
		StudentEx stu4 = new StudentEx(103,"Pruthvi","c",4);
		
		
		List<StudentEx> list = Arrays.asList(stu1,stu2,stu3,stu4);
		Collections.sort(list);
		list.forEach(stu->
		System.out.println(stu.getStudentId()+" "+stu.getStudentFName()+" "+stu.getStudentLName()+" "+stu.getStudentClass()
		));
	}
}
