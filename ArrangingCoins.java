package com.leetcode.july;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrangingCoins {

	public static void main(String[] args) {
		ArrangingCoins arrangingCoins = new ArrangingCoins();
		System.out.println(arrangingCoins.arrangeCoins(22));
	}

	private int arrangeCoins(int n) 
	{		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		int key=1;
		while(n>=0)
		{
			n = n-key;
			if(n>=0)
			 hm.put(key, key);
			else
				return Collections.max(hm.keySet());
			key++;
		}
		
		return 0;
	}
}


/*
 * You have a total of n coins that you want to form in a staircase shape, where
 * every k-th row must have exactly k coins.
 * 
 * Given n, find the total number of full staircase rows that can be formed.
 * 
 * n is a non-negative integer and fits within the range of a 32-bit signed
 * integer.
 * 
 * Example 1:
 * 
 * n = 5
 * 
 * The coins can form the following rows: ¤ ¤ ¤ ¤ ¤
 * 
 * Because the 3rd row is incomplete, we return 2. Example 2:
 * 
 * n = 8
 * 
 * The coins can form the following rows: ¤ ¤ ¤ ¤ ¤ ¤ ¤ ¤
 * 
 * Because the 4th row is incomplete, we return 3.
 */