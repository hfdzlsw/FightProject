package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListTest {
	private static final int COUNT = 100000;
	
	/** 测试List add(int index, E element)方法  */
	public void listAddTest() {
		List<Object> list = new ArrayList<>();
		list.add(0, 1);
		list.add(0, 2);
		list.add(0, 3);
		list.add(0, 4);
		list.add(0, 5);
		for (Object o : list) {
			System.out.println("index:" + list.indexOf(o) + "," + o.toString());
		}
	}
	
	/** 获取List实例的类型 */
	public String getListName(List list) {
		if (list instanceof LinkedList) {
			return "LinkedList";
		} else if (list instanceof ArrayList) {
			return "ArrayList";
		} else if (list instanceof Stack) {
			return "Stack";
		} else if (list instanceof Vector) {
			return "Vector";
		} else {
			return "list";
		}
	}
	
	/** 往List的第一个位置中插入COUNT条数据，并统计时间  */
	public void insertByIndex(List list) {
		Long startTime = System.currentTimeMillis();
		
		// 向list的位置0插入COUNT个数
		for (int i = 0; i < COUNT; i++) {
			list.add(0, i);
		}
		
		Long endTime = System.currentTimeMillis();
		
		Long interval = endTime - startTime;
		
		System.out.println(getListName(list) + ": insert " + COUNT + " elements into the 1st position use time：" + interval + " ms");
	}
	
	/** 从List中读取数据，并统计时间  */
	public void getByIndex(List list) {
		Long startTime = System.currentTimeMillis();
		
		// 向list的位置0插入COUNT个数
		for (int i = 0; i < COUNT; i++) {
			list.get(i);
		}
		
		Long endTime = System.currentTimeMillis();
		
		Long interval = endTime - startTime;
		
		System.out.println(getListName(list) + ": get " + COUNT + " elements by position use time：" + interval + " ms");
	}
	
	/** 从List的指定位置删除COUNT个元素，并统计时间  */
	public void deleteByIndex(List list) {
		Long startTime = System.currentTimeMillis();
		
		// 向list的位置0插入COUNT个数
		for (int i = 0; i < COUNT; i++) {
			list.remove(0);
		}
		
		Long endTime = System.currentTimeMillis();
		
		Long interval = endTime - startTime;
		
		System.out.println(getListName(list) + ": delete " + COUNT + " elements from the 1st position use time：" + interval + " ms");
	}
}
