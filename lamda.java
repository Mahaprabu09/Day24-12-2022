package day24112022;

interface say{
	public int num(int a,int b);
}

public class lamda {
	public static void main(String[] args) {
    System.out.println("Addition");
	say methods=(a,b)->(a+b);
		System.out.println(methods.num(10,20));
		System.out.println(methods.num(23,35));
		
	System.out.println("Subtraction");
	say method1=(a,b)->(a-b);
	System.out.println(method1.num(23, 3));
	System.out.println(method1.num(3, 3));
	
	System.out.println("multiplication");
	say method2=(a,b)->(a*b);
	System.out.println(method1.num(23, 3));
	System.out.println(method1.num(3, 3));
	}
}
