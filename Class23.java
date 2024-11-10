package hw3;

public class Class23 {

	public static void main(String[] args) {
		car23 c1 =new car23();
		
		c1.show();
		
		int num = 1234;
		double gas =20.5;
		String str="1號車";
		
		c1.setcar(num,gas);
		c1.setname(str);
		
		c1.show();
	}

}

class car23{
	private int num;
	private double gas;
	private String name;
	
	public car23()
	 {
	  num=0;
	  gas=0.0;
	  name = "沒有名稱";
	  System.out.println("生產了車子");
	  
	 }
	public void setcar(int n , double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
	 
	 public void setname(String nm)
	 {
	  
	  name=nm;
	 System.out.println("將車名設為"+name);
	 }
	 public void show()
	 {
	  System.out.println("車號是"+num);
	  System.out.println("汽油量是"+gas);
	  System.out.println("車名是"+name);
	 }
}
