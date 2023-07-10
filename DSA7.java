package Assi8;

public class DSA7 {

	public static void main(String[] args) {
		String s = "3[a]2[bc]44[a]0[q]";

		char[] cs = s.toCharArray();
		String prev = "";
		String sum = "";
		String add = "";
		for (int i = 0; i < cs.length; i++) {

			if (cs[i] < 'a' && cs[i] != '[' && cs[i] != ']') {
				if (i != 0 && cs[i - 1] < 'a' && cs[i - 1] != '[' && cs[i - 1] != ']') {
					prev += cs[i];
				} else
					prev = String.valueOf(cs[i]);
			} else if (cs[i] >= 'a' && cs[i] <= 'z') {
				add += String.valueOf(cs[i]);
			} else if (cs[i] == ']') {
				sum += add.repeat(Integer.parseInt(prev));
				prev = "";
				add = "";
			}
		}
		System.out.println(sum);
	}
}
