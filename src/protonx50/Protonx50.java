/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protonx50;

/**
 *
 * @author User
 */
public class Protonx50 {
String brand;
int modelYear;

//your constructor with parameter here
Protonx50(String b,int m){
    this.brand=b;
    this.modelYear=m;
}
Protonx50(){
    this.brand="protonx50";
    this.modelYear=2020;
}


public static void Protonx50() {
	System.out.println("Car is running...");
}

public static void Protonx50(String[] args) {
  Protonx50 obj1 = new Protonx50();
   Protonx50 obj2= new Protonx50("protonX70",2020);
			//call all method and print the value			
}
}
  