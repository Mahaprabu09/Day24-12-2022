package day24112022;

public class interfacetest implements writable{
	@Override
	public void write(String s) {
		System.out.println(s);
		
	}

	public static void main(String[]args)
	{
		interfacetest it=new interfacetest();
		it.write("hello there");
	}

	
}
