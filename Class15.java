package hw3;

public class Class15 {

	public static void main(String[] args) {
		Car15.showSum();
		
		Car15 car1;
		car1=new Car15();
		car1.setCar15(1234,20.5);
		
		Car15.showSum();
		Car15 car2;
		car2=new Car15();
		car2.setCar15(4567,30.5);

	}
}
class Car15
{
	public static int sum=0;
	
	private int num;
	private double gas;
	public Car15()
	{
		num=0;
		gas=0.0;
		sum++;
		System.out.println("生產了車子");
	}
	public void setCar15(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	public static void showSum()
	{
		System.out.println("車子總共有"+sum+"台");
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}