package project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import project.interfaces.StringInterfaces;

public class StringManipulation implements StringInterfaces {

	@Override
	public void reverseString(String str) {

		String temp = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			temp = ch + temp;

		}
		System.out.println(temp);

	}

	@Override
	public void Anagram(String str1, String str2) {

		if (str1.length() != str2.length()) {

			System.out.println(str1+" and " +str2+" are not Anagram");
		} else {

			char[] ch1 = str1.toCharArray();
			char ch2[] = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (ch1.equals(ch2)) {
				System.out.println(str1+" and " +str2+" are Anagram");
			} else {

				System.err.println(str1+" and " +str2+" are not Anagram");
			}

		}

	}

	@Override
	public void balanced(String str) {

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (st.empty()) {

				st.push(ch);
			}

			else if (ch == '{' || ch == '(' || ch == '[') {
				st.push(ch);
			}

			else if (ch == '}' && st.peek() == '{') {
				st.pop();
			} else if (ch == ')' && st.peek() == '(') {
				st.pop();
			} else if (ch == ']' && st.peek() == '[') {
				st.pop();
			}

		}

		if (st.isEmpty()) {
			System.out.println("Given String is a Balanced String");
		}

		else {
			System.out.println("Given String is not a Balanced String");
		}

	}

	

	@Override
	public void stringConcat(String str1, String str2) {

         System.out.println(str1.concat(" "+str2));

	}

	@Override
	public void stringPalidrome(String str) {
		
		String temp=str;
		String rev="";
		char ch;
		for (int i = 0; i < str.length(); i++) {

			ch = str.charAt(i);
			rev = ch + rev;

		}
		if(temp.equals(rev)) {
			
			System.out.println("Given String is Palidrome");
		}
		else {
			System.out.println("Given string is not a Palidrome");
		}

	}

	@Override
	public void occurence(String str) {
		
		Map<Character,Integer> result=new HashMap<>();
		String str1=str.replaceAll(" ", "");
		char arr[]=str1.toCharArray();
		for(char ch:arr) {
			
			if(result.containsKey(ch)) {
				
				result.put(ch, result.get(ch)+1);
			}
			else {
				
				result.put(ch,1);
			}
			
		}
		System.out.println(str1+" : "+result);
		
	}
	


	}


