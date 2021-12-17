package collectionApi;
import java.util.HashSet;
import java.util.Set;
import javax.swing.text.html.HTMLDocument.Iterator;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Set s = new HashSet<>();
	s.add("Hello");
	s.add("How are you?");
	s.add("How are you?");
	s.add(123);
	s.add(123);
	s.add(5678);
	s.add(5678);	
	
	System.out.println(s);
	java.util.Iterator i = s.iterator();	
		
	System.out.println(i.next());
	System.out.println(i.next());
	System.out.println(i.next());
	System.out.println(i.next());
	
	}
}
