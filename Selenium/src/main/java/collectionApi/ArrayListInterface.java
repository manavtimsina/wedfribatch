package collectionApi;

import java.util.ArrayList;
import java.util.List;
public class ArrayListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List l = new ArrayList<>();	
l.add("Hello");
l.add(1234);
l.add("Hi Everyone");
l.add("How are you");

//System.out.println(l);

//System.out.println(l.get(3));
//System.out.println(l.get(1));

for(int i = 0; i <l.size(); i ++)
	{
		System.out.println(l.get(i));	
	}
		
	}

}
