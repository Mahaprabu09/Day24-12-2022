package day24112022;

import java.util.List;
import java.util.ArrayList;

public class listofnames {
	public static void main(String[]args)
	{
		List<String> l=new ArrayList<String>();
		l.add("maha");
		l.add("prabu");
		l.add("anudip");
		l.add("albert leo");
		l.add("anudip foundation");
		
		l.forEach(
			(n)->System.out.println(n));
		
	}

}
