package com.interviewPrep.leetcode.easy.mergesortedarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FirstApproach {

	public static void main(String[] args) {

		int nums1[] = {1,2,3,0,0,0};
		int m = 3;
		int nums2[] = {2,5,6};
		int n = 3;


		FirstApproach fa = new FirstApproach();
		fa.merge(nums1, 3, nums2, 3);

	}

	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		// add elements of second array into first array
		for(int i=0; i<n; i++) {

			nums1[m] = nums2[i];
			m++;
		}
		
		// sort first array
		Arrays.sort(nums1);
	}


}
