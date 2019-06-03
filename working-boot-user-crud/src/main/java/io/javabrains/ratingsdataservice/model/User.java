package io.javabrains.ratingsdataservice.model;

import org.springframework.hateoas.ResourceSupport;

public class User {
	private long userId;

	private String name;

	private int age;

	private double salary;

	public User() {
		userId = 0;
	}

	public User(long id, String name, int age, double salary) {
		this.userId = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long id) {
		this.userId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + userId + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
