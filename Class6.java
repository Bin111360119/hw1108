package hw3;



public class Class6 {
    public static void main(String[] args) {
        
    	car6 c1 = new car6();
        
        c1.setnum(1234);
        c1.setgas(20.5);
     
        
       
        
    }

}

class car6{
	int num;
	double gas;
	
	void setnum(int n) {
		num=n;
		System.out.println("將車號設為 " + num);
	}
	
	void setgas(double g) {
		gas=g;
		System.out.println("將汽油量設為 " + gas);
		
	}
	}
	


