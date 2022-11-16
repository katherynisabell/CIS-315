import java.util.ArrayList;
import java.util.*;

public class ArrayListSortSwap{
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		
        nameList.add("Marge");
        nameList.add("Nick");
        nameList.add("Maria");
        nameList.add("Daniel");
        nameList.add("Sarah");
        nameList.add("Nancy");
        nameList.add("Mike");
        nameList.add("Harold");

		System.out.println("List 1: Original Name List");        
		System.out.println(nameList);

		System.out.println(" ");
		System.out.println("List 2: Removed Element 5");		
		nameList.remove(5);
		System.out.println(nameList);

		System.out.println(" ");
		System.out.println("List 3: Sorted List:");
		Collections.sort(nameList);
		System.out.println(nameList);

		System.out.println(" ");
		System.out.println("List 4: Swapped Element 1 and 5");
		Collections.swap(nameList, 1, 5);
		System.out.println(nameList);
	}
}

