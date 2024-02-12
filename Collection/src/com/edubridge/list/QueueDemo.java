package com.edubridge.list;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Object> q = new PriorityQueue<>();
		q.add(45);
		q.add(88);
		q.add(7878);
		System.out.println(q);

		Deque<Integer> d = new LinkedList<>();
		d.add(545);
		d.add(877);
		d.add(78);
		System.out.println(d);
		d.addLast(45); // add last and addfirst works only in deque since it uses enter and remove from
						// both sides in a list
		d.removeFirst();
		System.out.println();
		System.out.println(d.peek());
		d.removeLast();
		d.removeLast();
		d.removeLast();
		//d.removeLast();
		System.out.println(d);
		

	}

}
