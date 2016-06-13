package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import collection.ListTest;

public class OperateClass {

	public static void main(String[] args) {
		// List add method test
		ListTest listTest = new ListTest();
//		listTest.listAddTest();
		
		// List compare test  http://www.cnblogs.com/skywang12345/p/3308900.html
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		List<Integer> vector = new Vector<>();
		List<Integer> stack = new Stack<>();
		
		System.out.println();
		
		listTest.insertByIndex(arrayList);
		listTest.insertByIndex(linkedList);
		listTest.insertByIndex(vector);
		listTest.insertByIndex(stack);
		
		System.out.println();

		listTest.getByIndex(arrayList);
		listTest.getByIndex(linkedList);
		listTest.getByIndex(vector);
		listTest.getByIndex(stack);
		
		System.out.println();

		listTest.deleteByIndex(arrayList);
		listTest.deleteByIndex(linkedList);
		listTest.deleteByIndex(vector);
		listTest.deleteByIndex(stack);
		
		// http://www.cnblogs.com/chenssy/p/3372798.html
	}

}
