package com.capgemini.hibernate.test;

import com.capgemini.hibernate.dao.*;
import com.capgemini.hibernate.person.*;

public class Main{
	public static void main(String[] args){
		PersonDaoImpl person = new PersonDaoImpl();
		person.addPerson(new Person(101,"kapil"));
		System.out.println("Successfullllll.....");
	}
}
