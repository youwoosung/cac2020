import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		//array
		String[] strArray = {"Matthew", "Emily", "Luke"};
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		List<String> strList = new ArrayList();
		strList.add("Matthew-1");
		strList.add("Emily-1");
		strList.add("Luke-1");
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println("inserting woosung");
		strList.add("Woosung-1");
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		System.out.println("removing the first element");
		strList.remove(0);
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		String str = "dsakjdkf jka dkfajdska jkajdfkajfk";
		char firstCh = str.charAt(0);
		System.out.println(firstCh);
		if(firstCh == 'd') {
			System.out.println("First character is d!!!");
		}
		System.out.println("Size of str is " + str.length());
	}

}
