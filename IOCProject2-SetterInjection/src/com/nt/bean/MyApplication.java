package com.nt.bean;
import java.util.Scanner;
public class MyApplication {
		Animal animal = null;
		public void setanimal(Animal animal1){
			animal = animal1;
		}
		
		public void factorial_calculator() {
			Scanner scan = new Scanner(System.in);
			System.out.println("nter the number");
			int n = scan.nextInt();
			System.out.println(animal.factorail(n));
		}
}
