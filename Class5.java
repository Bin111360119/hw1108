package hw3;



public class Class5 {
    public static void main(String[] args) {
        
    	car5 c1 = new car5();
        
        c1.num = 1234;
        c1.gas = 20.5;
        
       
       c1.showcar();
        
        
        
        
       
        
    }

}

class car5{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
	}
	
	void showcar() {
		System.out.println("開始顯示車子資料");
		this.show();
	}
	}
	


