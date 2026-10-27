package demo7;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Set<String>> danhBa = new HashMap<>();
		danhBa.put("An SE", new HashSet<>(List.of("018434745","072536405476")));
		danhBa.put("Hoa SE", new HashSet<>(List.of("0183564745","072599995476")));
		danhBa.put("Binh SE", new HashSet<>(List.of("0184349995")));
		danhBa.put("Nga SE", new HashSet<>(List.of("0184343455","0725364059899")));
		//System.out.println(danhBa.get("Hoa SE"));
		
		Set<Entry<String, Set<String>>> entrySet = danhBa.entrySet();
		
		Iterator<Entry<String, Set<String>>> it = entrySet.iterator();
		
		
	}
}
