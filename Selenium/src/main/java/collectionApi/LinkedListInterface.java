package collectionApi;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List li = new LinkedList<>();

		li.add("Hello"); // gets index 0
		li.add(1234);  // gets index 1
		li.add("Hi Everyone");  // gets index 2
		li.add("How are you");  // gets index 3
		
		//System.out.println(li);
		System.out.println(li.get(3));
		System.out.println(li.get(2));
		
		
		for(int i = 0; i <li.size(); i ++)
		{
			System.out.println(li.get(i));	
		}
		
	}

}
