package com.demo;

import java.util.Iterator;
import java.util.Stack;

public class HackerRank {

	static Character getOpeningChar(Character c) {
		if(c == ')')
			return '(';
		else if (c == ']') {
			return '[';
		}else {
			return '{';
		}
	}
	
	static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length();i++) {
			char x = s.charAt(i);
			if(x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty() || stack.pop() != getOpeningChar(x)) {
				return false;
			}
			
		}
		return stack.isEmpty();
	}
	
	
}
