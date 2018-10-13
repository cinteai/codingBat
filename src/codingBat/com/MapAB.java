package codingBat.com;

import java.util.HashMap;
import java.util.Map;

public class MapAB {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("a", "Hi");
		m.put("b", "There");
		System.out.println(mapAB(m));
		
	}
	private static Map<String, String> mapAB(Map<String, String> map) {
		if(map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a").concat(map.get("b")));
		}
		return map;
	}
}
