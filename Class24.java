package hw3;

public class Class24 {

	public static void main(String[] args) {
		car24[] car1 = new car24[3];
		
		for(int i=0;i<car1.length;i++) {
			car1[i]=new car24();
		}
		car1[0].setcar(1234,20.5);
		car1[1].setcar(2345,30.5);
		car1[2].setcar(3456,40.5);
		
		for(int i=0;i<car1.length;i++) {
			car1[i].show();
		}
	}
}
class car24{
	int num;
	double gas;
	
	public car24() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");	
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public void show(){
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}
