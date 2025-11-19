package com.student;

public interface StudentOperations {

	public student addstudent(int sid);
	public student getstudent(String name);
	public student setstudent(String name,int sid,int age);
	public student removestudent(int sid);
	public student containsstudent(String name);
	public student highestagestudent(int age);
	
}
	