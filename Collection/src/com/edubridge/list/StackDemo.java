package com.edubridge.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Object> s = new Stack<>();
		s.add("Muffy");
		s.add(45);
		s.add(8787.89);
		s.add('s');
		System.out.println(s.lastElement());
		System.out.println(s);
		s.pop();
		s.push('N');
		System.out.println(s);
	}

}
