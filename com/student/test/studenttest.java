package com.student.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.student.dao.studentdao;
import com.student.dao.studentdaoimpl;
import com.student.pojo.Student;

public class studenttest {
	public static void main(String[] args) {
		
		int rollno;
		String name,email,course;
		String address,city,state,country,contactno;
		int mychoice;
		char FinalChoice;
		boolean flag;
		String listobj2;
		
		Student stdobj=new Student();
		
		studentdao stddaoobj=new studentdaoimpl();
		
	    List<Student> listobj=new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("**********Student Details*************");
			System.out.println("1.Add Student Details");
			System.out.println("2.Update Student Details");
			
			System.out.println("Enter Your Choice...");
			mychoice=sc.nextInt();
			
			switch(mychoice) {
			case 1:
				System.out.println("Enter Student Name");
				name=sc.next();
				System.out.println("Enter Student Email");
				email=sc.next();
                System.out.println("Enter Student Course");
                course=sc.next();
                System.out.println("Enter Student address");
                address=sc.next();
                System.out.println("Enter Student City");
                city=sc.next();
                System.out.println("Enter Student country");
                country=sc.next();
                System.out.println("Enter Student contactno");
                contactno=sc.next();
                
                stdobj= new Student(name,email,course,address,city,country,contactno, null);
                flag=stddaoobj.addstudent(stdobj);
                
                if(flag) {
                	System.out.println("Add Succefully..........");
                }
                else {
                	System.out.println("Not Added..");
                }
			case 2:
				System.out.println("Enter Student Roll Number ");
				rollno=sc.nextInt();
				System.out.println("Enter Student Name");
				name=sc.next();
				System.out.println("Enter Student Email");
				email=sc.next();
                System.out.println("Enter Student Course");
                course=sc.next();
                System.out.println("Enter Student address");
                address=sc.next();
                System.out.println("Enter Student City");
                city=sc.next();
                System.out.println("Enter Student country");
                country=sc.next();
                System.out.println("Enter Student contactno");
                contactno=sc.next();
                
                stdobj=new Student(rollno,name,email,course,address,city,country,contactno);
                flag=stddaoobj.UpdateStudent(stdobj);
                
                if(flag) {
                	System.out.println("Succefully....");
                }
                else {
                	System.out.println("Not Added succefully..");
                }
                break;
			case 3:
				
				System.out.println("Delete Student Details");
				System.out.println("Enter Your rollnumber Details ");
				rollno=sc.nextInt();
				
			stdobj.setRollno(rollno);
			flag=stddaoobj.DeleteStudent(rollno);
			
			if(flag) {
				System.out.println("Delete Succcefully.......");
				
			}
			else {
				System.out.println("Not Delete  Succefully...");
			}
			break;
			case 4:
				System.out.println("Show All Details");
				listobj=stddaoobj.ShowAll();
				if(listobj !=null) {
					for(Student lo:listobj) {
						System.out.println(lo);
						
						
					}
					
				}else{
				System.out.println("Not Find");
				}
				
				
				
				

						
			}
			
			
			System.out.println("Do You Want to continues if yes press'y'||press Y");
			FinalChoice=sc.next().charAt(0);
		}while(FinalChoice =='y'||FinalChoice=='Y');
		
		
		
		
		}
		

	}


