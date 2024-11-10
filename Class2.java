package hw3;

import hw3.Car;

public class Class2 {
    public static void main(String[] args) {
        
    	Car2 car1 = new Car2();
        
        car1.num = 1234;
        car1.gas = 20.5;
        
        System.out.println("車號是 " + car1.num);
        System.out.println("汽油量是 " + car1.gas);
        
    }

}
class Car2 {

	
	int num;
    double gas;


}
