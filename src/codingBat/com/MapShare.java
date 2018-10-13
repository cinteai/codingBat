package codingBat.com;

import java.util.HashMap;
import java.util.Map;

public class MapShare {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("a", "aaa");
		m.put("b", "bbb");
		m.put("c", "ccc");
		System.out.println(mapShare(m));
	}

	private static Map<String, String> mapShare(Map<String, String> map) {
		map.computeIfPresent("a", (k, v) -> {
			map.put("b", v);
			return v;
		});
		map.remove("c");
		return map;
	}

}
