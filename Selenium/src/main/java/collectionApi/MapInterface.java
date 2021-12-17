package collectionApi;

import java.util.HashMap;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		hm.put(1, "data1");
		hm.put("key2", "data2");
		hm.put("key3", "100");
			
		System.out.println(hm.get("key2"));

	}

}
