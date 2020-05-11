package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.pojo.Student;
import com.student.utility.DBConnection;

public class studentdaoimpl implements studentdao {
Connection con=DBConnection.getConnection();
PreparedStatement ps=null;
String sql;
int Result;
ResultSet rs=null;
List<Student> listobj2=new ArrayList<>();

	@Override
	public boolean addstudent(Student s) {
		try {
			sql="insert into student(name,email,course,address,city,state,country,contactno) Values(?,?,?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getCourse());
			ps.setString(4, s.getAddress());
			ps.setString(5, s.getCity());
			
			ps.setString(6, s.getState());
			ps.setString(7, s.getCountry());
			ps.setString(8, s.getContactno());
			Result=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(Result>0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean UpdateStudent(Student s) {
		try {
			sql="update student set name=?,email=?,course=?,address=?,city=?,state=?,country=?,contactno=? where rollno=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getCourse());
			ps.setString(4, s.getAddress());
			ps.setString(5, s.getCity());
			ps.setString(6, s.getState());
			ps.setString(7, s.getCountry());
			ps.setString(8, s.getContactno());
			ps.setInt(9, s.getRollno());
			Result=ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(Result>0) {
			return true;
		}
		else {
		
		return false;
		}
	}

	@Override
	public boolean DeleteStudent(int rollno) {
		try {
			sql="delete from student where rollno=?";
			
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, rollno);
			Result=ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		if(Result>0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public List<Student> ShowAll() {
		try {
			sql="select * from student";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				Student stdobj=new Student();
				stdobj.setRollno(rs.getInt(1));
				stdobj.setName(rs.getString(2));
				stdobj.setEmail(rs.getString(3));
				
				stdobj.setCourse(rs.getString(4));
				stdobj.setAddress(rs.getString(5));
				stdobj.setCity(rs.getString(6));
				stdobj.setState(rs.getString(7));
				stdobj.setCountry(rs.getString(8));
				stdobj.setContactno(rs.getString(9));
				
				listobj2.add(stdobj);
			}
			return listobj2;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

}
