package com.interviewPrep.leetcode.easy.mergesortedarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SecondApproach {

	public static void main(String[] args) {
		
		
		int nums1[] = {1,2,3,0,0,0};
		int m = 3;
		int nums2[] = {2,5,6};
		int n = 3;
		
		SecondApproach sa = new SecondApproach();
		sa.merge(nums1, m, nums2, n);
		
	}
	
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		// Create an arraylist. We'll push all numbers from both given array into this arrayList
		List numList = new ArrayList<>();
		
		// Push all numbers from first array into the arrayList
		for(int i=0; i<m; i++ ) {

			numList.add(nums1[i]);
		}

		// Push all numbers from second array into the arrayList
		for(int i=0; i<n; i++ ) {

			numList.add(nums2[i]);
		}
		
		// Now sort this arrayList
		Collections.sort(numList);
		
		// Finally iterate the arraylist and populate the first array
		m=0;
		Iterator iter = numList.iterator();
		while(iter.hasNext()) {

			int num = (int) iter.next();
			//System.out.println(num);

			nums1[m] = num;
			m++;
		}

	}


}
