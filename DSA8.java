package Assi8;

import java.util.HashSet;
import java.util.Set;

public class DSA8 {

	    public static void main(String[] args){
	    	String s="ab",goal="ba";
	    }
	    
	    public boolean check(String s,String goal)
	    {
	    	if(s.length() != goal.length()){
	            return false;
	        }

	        int n = s.length();
	        if (s.equals(goal)) {
	            Set<Character> temp = new HashSet<>();
	            for (char c : s.toCharArray()) {
	                temp.add(c);
	            }
	            return temp.size() < goal.length(); // Swapping same characters
	        }

	        int i = 0;
	        int j = n - 1;

	        while (i < j && s.charAt(i) == goal.charAt(i)) {
	            i++;
	        }

	        while (j >= 0 && s.charAt(j) == goal.charAt(j)) {
	            j--;
	        }

	        if (i < j) {
	            char[] sArr = s.toCharArray();
	            char temp = sArr[i];
	            sArr[i] = sArr[j];
	            sArr[j] = temp;
	            s = new String(sArr);
	        }

	        return s.equals(goal);
	    }
	    	
	    
	}

