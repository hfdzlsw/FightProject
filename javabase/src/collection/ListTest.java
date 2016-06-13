package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListTest {
	private static final int COUNT = 100000;
	
	/** ����List add(int index, E element)����  */
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
	
	/** ��ȡListʵ�������� */
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
	
	/** ��List�ĵ�һ��λ���в���COUNT�����ݣ���ͳ��ʱ��  */
	public void insertByIndex(List list) {
		Long startTime = System.currentTimeMillis();
		
		// ��list��λ��0����COUNT����
		for (int i = 0; i < COUNT; i++) {
			list.add(0, i);
		}
		
		Long endTime = System.currentTimeMillis();
		
		Long interval = endTime - startTime;
		
		System.out.println(getListName(list) + ": insert " + COUNT + " elements into the 1st position use time��" + interval + " ms");
	}
	
	/** ��List�ж�ȡ���ݣ���ͳ��ʱ��  */
	public void getByIndex(List list) {
		Long startTime = System.currentTimeMillis();
		
		// ��list��λ��0����COUNT����
		for (int i = 0; i < COUNT; i++) {
			list.get(i);
		}
		
		Long endTime = System.currentTimeMillis();
		
		Long interval = endTime - startTime;
		
		System.out.println(getListName(list) + ": get " + COUNT + " elements by position use time��" + interval + " ms");
	}
	
	/** ��List��ָ��λ��ɾ��COUNT��Ԫ�أ���ͳ��ʱ��  */
	public void deleteByIndex(List list) {
		Long startTime = System.currentTimeMillis();
		
		// ��list��λ��0����COUNT����
		for (int i = 0; i < COUNT; i++) {
			list.remove(0);
		}
		
		Long endTime = System.currentTimeMillis();
		
		Long interval = endTime - startTime;
		
		System.out.println(getListName(list) + ": delete " + COUNT + " elements from the 1st position use time��" + interval + " ms");
	}
}
