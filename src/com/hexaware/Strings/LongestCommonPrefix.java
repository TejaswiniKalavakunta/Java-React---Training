package com.hexaware.Strings;

public class LongestCommonPrefix {
	public
	 
	static String longestCommonPrefix(String[][] strs)
	 
	{
	        if (strs.length == 0 || strs[0].length == 0) {
	            return ""; // Handle empty array or empty strings
	        }

	        // Initialize prefix with the first string of the first row
	        String prefix = strs[0][0];

	        // Iterate through each row and column of the array
	        for (int i = 1; i < strs.length; i++) {
	            for (int j = 0; j < strs[i].length; j++) {
	                prefix = commonPrefixUtil(prefix, strs[i][j]);
	                if (prefix.isEmpty()) {
	                    return ""; // No common prefix found
	                }
	            }
	        }

	        return prefix;
	    }

	    private static String commonPrefixUtil(String str1, String str2) {
	        int i = 0;
	        int minLength = Math.min(str1.length(), str2.length());
	        while (i < minLength && str1.charAt(i) == str2.charAt(i)) {
	            i++;
	        }
	        return str1.substring(0, i);
	    }

	    public static void main(String[] args) {
	        String[][] strs = {{"flower", "flow", "flight"}, 
	        		           {"apple", "ape", "application"}};
	        String prefix = longestCommonPrefix(strs);
	        System.out.println(prefix);  // Output: fl
	    }
}
