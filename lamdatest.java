package day24112022;

interface names{
	public String sayable(String name);

}
public class lamdatest{
	public static void main(String[]ags)
	{
		names n1=(name)->(name);
		System.out.println(n1.sayable("Mahaprabu"));
		
		
	}
	
}