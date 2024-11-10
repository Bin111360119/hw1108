package hw3;



public class Class9 {
    public static void main(String[] args) {
        
    	car9 c1 = new car9();
        c1.num=1234;
        c1.gas=-10;
        
        c1.show();
       
        
    }

}

class car9{
	int num;
	double gas;
	
	void show() {
		
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);		
	}
	}
	