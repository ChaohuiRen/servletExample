package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
 public static List<Student> getStudent(){
	 //create an empty list
	 List<Student> students= new ArrayList<>();
	 //add sample data
	 students.add(new Student("Chaohui","Ren","czr0050"));
	 students.add(new Student("Chaohui1","Ren1","czr0051"));
	 students.add(new Student("Chaohui2","Ren2","czr0052"));
	 students.add(new Student("Chaohui3","Ren3","czr0053"));
	 //return the list
	 return students;
 }
 
}
