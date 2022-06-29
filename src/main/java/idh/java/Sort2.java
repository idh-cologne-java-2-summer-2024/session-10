package idh.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sort2 {
	
	public static int compare(int i1, int i2) {
		if (i1 < i2)
			return -1;
		if (i1 == i2)
			return 0;
		return 1;
	}
	

	
	public static List<Integer> sort(List<Integer> array) {
		// recursive base case
		if (array.size() == 1)
			return array;
		else {
			// recursion step
			int splitpos = array.size() / 2;
			List<Integer> h1 = array.subList(0, splitpos);
			List<Integer> h2 = array.subList(splitpos, array.size());
			
			h1 = sort(h1);
			h2 = sort(h2);

			ArrayList<Integer> r = new ArrayList<Integer>(array.size());
		 	
			int h1i = 0, h2i = 0;
			while(h1i < h1.size() && h2i < h2.size()) {
				int e1 = h1.get(h1i);
				int e2 = h2.get(h2i);
				
				int comp = compare(e1, e2);
				
				if (comp < 0) {
					r.add(e1);
					h1i++;
				} else if (comp > 0) {
					r.add(e2);
					h2i++;
				} else {
					r.add(e1);
					r.add(e2);
					h1i++;
					h2i++;
				}
			}
			
			for (; h1i < h1.size(); h1i++) {
				r.add(h1.get(h1i));
			}
			for (; h2i < h2.size(); h2i++) {
				r.add(h2.get(h2i));
			}
			
			return r;

		}
				
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
