package idh.java;

import java.util.ArrayList;
import java.util.List;

public class Sort1 {
	
	public static int compare(int i1, int i2) {
		if (i1 < i2)
			return -1;
		if (i1 == i2)
			return 0;
		return 1;
	}
	
	public static int findInsertPosition(List<Integer> lst, int element) {
		for (int j = 0; j < lst.size(); j++) {
			int cmp = compare(lst.get(j), element);
			if (cmp > 0) {
				return j;
			}
		}
		return lst.size();
	}
	
	public static List<Integer> sort(List<Integer> array) {
		ArrayList<Integer> r = new ArrayList<Integer>(array.size());
		for (int i = 0; i < array.size(); i++) {
			int c = array.get(i);
			
			if (r.isEmpty())
				r.add(c);
			else {
				int insertPosition = findInsertPosition(r, c);
				r.add(insertPosition, c);
			}
		}
		return r;
		
	}
	
	public static final void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		System.out.println(arr);
		System.out.println(sort(arr));
		
		arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(1);
		arr.add(2);
		
		System.out.println(arr);
		System.out.println(sort(arr));

	}
}
