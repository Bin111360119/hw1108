package hw3;



public class Class8 {
    public static void main(String[] args) {
        
    	car8 c1 = new car8();
        c1.setnumgas(1234,20.5);
        int number=c1.getnum();;
        double gasoline=c1.getgas();;
        System.out.println("調查樣品車時得知");
        System.out.println("車號是"+number+"，汽油量是"+gasoline);
       
        
    }

}

class car8{
	int num;
	double gas;
	
	int getnum() {
		System.out.println("調差車號");
		return num;
	}
	
	double getgas() {
		
		System.out.println("調查汽油量");
		return gas;
		}
	void setnumgas(int n, double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
		
				
	}
	}
	


