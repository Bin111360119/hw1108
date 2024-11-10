package hw3;



public class Class4 {
    public static void main(String[] args) {
        
    	car4 c1 = new car4();
        
        c1.num = 1234;
        c1.gas = 20.5;
        
       
       c1.show();
       c1.show();
        
        
        
       
        
    }

}

class car4{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
	}
	}
	


