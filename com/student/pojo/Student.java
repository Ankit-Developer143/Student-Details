package com.student.pojo;

public class Student {

		private int rollno;
		private String name,email,course;
		private String address,city,state,country,contactno;
		public Student() {
			
		}
		public Student(String name, String email, String course, String address, String city, String state,
				String country, String contactno) {
			super();
			this.name = name;
			this.email = email;
			this.course = course;
			this.address = address;
			this.city = city;
			this.state = state;
			this.country = country;
			this.contactno = contactno;
		}
		public Student(int rollno,String name, String email, String course, String address, String city, String state,
				String country) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.email = email;
			this.course = course;
			this.address = address;
			this.city = city;
			this.state = state;
			this.country = country;
			this.contactno = contactno;
		}
		
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", name=" + name + ", email=" + email + ", course=" + course
					+ ", address=" + address + ", city=" + city + ", state=" + state + ", country=" + country
					+ ", contactno=" + contactno + "]";
		}
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getContactno() {
			return contactno;
		}
		public void setContactno(String contactno) {
			this.contactno = contactno;
		}


	}


