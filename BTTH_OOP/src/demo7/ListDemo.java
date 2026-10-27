package demo7;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
//		List<String> names = new ArrayList<String>();
//		namse.add("Lan");
		
		List<String> names = List.of("Lan","Hoa","Binh","Nga","Lan");
//		List<String> result = new ArrayList<String>();
//		for(String name : names) {
//			if(name.equalsIgnoreCase("lan")) {
//				result.add(name);
//			}
//		}
		List<String> result = names.stream()
				.filter(name -> name.equalsIgnoreCase("lan"))
				.toList();
		System.out.println(result);
	}
}
