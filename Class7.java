package hw3;



public class Class7 {
    public static void main(String[] args) {
        
    	car7 c1 = new car7();
        
        int num=1234;
        double gas=20.5;
        
        c1.setnumgas(num,gas);
        

    }

}

class car7{
	int num;
	double gas;
	
	void setnumgas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為 " + num+"，汽油量設為"+gas);
	}
	
	
	}
	


