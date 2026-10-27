package demo7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Demo1 {
	public static void main(String[] args) {
	
		//List <Double> list = new ArrayList<>(); //Generic // k khai bao thi kieu du lieu nao cung duoc
		 //List <Double> list = new Vector<Double>();
		//Set<Double> list = new HashSet<Double>(); // ko chua gia tri trung va k tim bang index dc, k duy tri thu tu chen vao
		Set<Double> list = new LinkedHashSet<Double>(); // duy tri thu tu chen vao
		list.add(100.5);
		list.add(130.5);
		list.add(140.5);
		list.add(160.5);
		list.add(100.0);// dang kieu Integer nen so thuc k dc
		//Collections.sort(list);
		list.remove(2);
//		for(int i =0;i< list.size();i++) {
//			System.out.println(list.get(i));
//		}
		for(Double e : list) {
			System.out.println(e);
		}
		
		
		
		
		//int size = list.size();
		
		//System.out.println(size); // so phan tu thuc co trong collection
		
//		System.out.println(list.isEmpty());
		
		
	}
}
 