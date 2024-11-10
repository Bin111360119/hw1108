package hw3;



public class Class11 {
    public static void main(String[] args) {
        
    	car11 c1 = new car11();
        
    	c1.setcar(1234,20.5);
        c1.show();
       
        System.out.println("變更車號");
        c1.setcar(2345);
        c1.show();
        
        
        System.out.println("變更汽油量");
        c1.setcar(30.5);
        c1.show();
    }

}

class car11{
	private int num;
	private double gas;
	
	public void setcar(int n) {
		num=n;
		System.out.println("將車號設為"+num);
	}
	public void setcar(double g) {
		gas=g;
		System.out.println("將汽油量設為"+gas);
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"將汽油量設為"+gas);
	}
	
	public void show() {
		
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);		
	
	}
	}


