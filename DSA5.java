package Assi8;

import java.util.LinkedHashMap;

public class DSA5 {

	public static void main(String[] args) {
		char chars[]={'a','a','b','b','c','c','c'};
		String sd="";
		LinkedHashMap<Character,Integer> s= new LinkedHashMap();
		for(int i=0;i<chars.length;i++)
		{
			if(s.get(chars[i])!=null)
			{
				s.put(chars[i], Integer.valueOf(s.get(chars[i])+1));
			}
			else
			{
				s.put(chars[i], 1);
				sd+=chars[i];
			}		
		}
		char[] cs = sd.toCharArray();
		sd="";
		for(int i=0;i<cs.length;i++)
		{
			sd=sd+cs[i]+(s.get(cs[i])>1?s.get(cs[i]):"");
		}

		System.out.println(sd.toCharArray());
	}
}
