package dog;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

 

public class Dog {

	private String name;

	private String type;

	public Dog(String name, String type) {

		this.name = name;

		this.type = type;

	}

	public String getType() {

		return type;

	}

	public void setType(String type) {

		this.type = type;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String toString() {

		return "name: "+ this.name+ ", breed: " + this.type;

	}

	public static void main(String[] args) {

		List<Dog> dogs = new ArrayList<Dog> ();

		Scanner in = new Scanner(System.in);

		while(true) {

			System.out.println("name: ");

			String name = in.next();

			System.out.println("breed: ");

			String breed = in.next();

			dogs.add(new Dog(name, breed));

			System.out.println("continue? y/n");

			if(in.next().equals("n")) break;

		}

		in.close();

		

		for(Dog d : dogs) {

			System.out.println(d.toString());

		}

	}

}

 