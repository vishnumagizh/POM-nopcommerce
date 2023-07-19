package com.greens.pom;

public class Pojoexample {
	

	private int age;
	private String name;
	private double salary;
	
	
	Pojoexample(int a,String n,double s)
	{
		this.age=a;
		this.name=n;
		this.salary=s;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
