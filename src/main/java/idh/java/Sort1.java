package idh.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sort1 {
	
	public static int compare(int i1, int i2) {
		if (i1 < i2)
			return -1;
		if (i1 == i2)
			return 0;
		return 1;
	}
	
	public static int findInsertPosition(List<Integer> lst, int element) {
		// TODO: Implement
		return 0;
	}
	
	public static List<Integer> sort(List<Integer> array) {
		// TODO: Implement
		return null;
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

	
	
	
	
	
	
	
	
	
	
	public static void largeListExperiment(int n) {
		long start;

		Random random = new Random();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(random.nextInt());
		}
		
		start = System.currentTimeMillis();
		List<Integer> listSorted = sort(list);
		System.out.printf("Sort1 a list with %d = %1.0e random elements: %dms.%n", n, (double)n, (System.currentTimeMillis()-start));

	}


}
