package com.Oops;

public class Static_method {

	public static void sirisha_age() {
		int age = 22;
		System.out.println("sirisha age is:" + age);
	}

	public static void coolege_name() {
		String collname = "bvrit";
		System.out.println("my college name is:" + collname);
	}

	public static void fvrt_colour() {
		String colour = "balack&white";
		System.out.println("my fvrt colour is:" + colour);
	}

	public static void fvrt_movie() {
		String movie = "kushi";
		System.out.println("my fvrt movie name is:" + movie);
	}

	public static void my_hero() {
		String hero = "Daddy";
		System.out.println("my hero is my:" + hero);
	}

	public static void main(String[] args) {
		my_hero();
		fvrt_movie();
		sirisha_age();
		coolege_name();
		fvrt_colour();
		System.out.println("--------------------");
		Static_method sm = new Static_method();
		sm.fvrt_colour();
		sm.my_hero();
		sm.fvrt_movie();
		sm.sirisha_age();
		sm.coolege_name();
		

	}

}
