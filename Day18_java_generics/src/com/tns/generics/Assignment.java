package com.tns.generics;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


public class Assignment {

	

	

		@SuppressWarnings("unused")
		public static void main(String[] args) {
			
			Queue<Integer>p=new PriorityQueue<Integer>();
			p.offer(100);
			p.offer(155);
			System.out.println(p);
			Iterator<Integer> itr=p.iterator();
			Integer s=p.peek();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println(p);
		}
		}