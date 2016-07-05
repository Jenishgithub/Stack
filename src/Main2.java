import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main2 {
	public static void main(String[] args) {
		Stack<List<String>> stringstack = new Stack<>();
		List<String> firstlist = new ArrayList<>();
		firstlist.add("jenish");
		firstlist.add("Shrigesh");
		firstlist.add("Chudamain");
		firstlist.add("Tijalh");
		firstlist.add("Susan");
		stringstack.push(firstlist);
		List<String> secondlsit = new ArrayList<>();
		secondlsit.add("Rajani");
		secondlsit.add("Sabina");
		secondlsit.add("Raina");
		secondlsit.add("jasmine");
		secondlsit.add("Samjhana");
		stringstack.push(secondlsit);

		List<String> thirdlist = new ArrayList<>();
		thirdlist.add("ManjulChakka");
		thirdlist.add("SarojChakka");
		thirdlist.add("BhoteChakka");
		thirdlist.add("AanandChakka");
		thirdlist.add("RajuChakka");
		stringstack.push(thirdlist);

		System.out.println(stringstack);

		stringstack.pop();
		// stringstack.pop();

		// check if stack is empty
		if (stringstack.isEmpty()) {
			System.out.print("Stack is empty");
		} else {
			System.out.println("Not empty");
		}
		System.out.println(stringstack);
	}
}
