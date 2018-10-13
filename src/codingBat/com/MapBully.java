package codingBat.com;

import java.util.HashMap;
import java.util.Map;

public class MapBully {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("a", "candy");
		m.put("b", "dirty");
		
		System.out.println(mapBully(m));
	}
	
	private static Map<String, String> mapBully(Map<String, String> map) {
		map.computeIfPresent("a", (k,v) -> {
			map.put("b", v);
			return "";
					
		});

		return map;
	}

}
