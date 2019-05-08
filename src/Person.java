package com.capgemini.hibernate.person;

import javax.persistence.*;

@Entity
public class Person{
	@Id
	private int personId;
	private String personName;
	
	public Person(int id,String name){
		personId = id;
		personName = name;
	}
	
	public String toString(){
		return "person id " + personId + "person name " + personName; 
	}
}