package Append;
import java.util.HashSet;

public class AppendToHashSet {

	public static void main(String[] args) {
		HashSet<String>hashset=new HashSet<>();
		//Adding initial elements to the hash set
		hashset.add("sharmitha");
		hashset.add("varshini");
		hashset.add("sharu");
		hashset.add("priya");
		//Element to be appended
		String elementToAppend = "Reshma";
		//Append the element to the hash set
		hashset.add(elementToAppend);
		String elementToAppend1 = "Rahul";
		hashset.add(elementToAppend1);
		//printing the updated hash set
		System.out.println("Updated Hashset:"+hashset);

	}

}
