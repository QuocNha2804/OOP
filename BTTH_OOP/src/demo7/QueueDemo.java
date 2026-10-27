package demo7;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		int n =5;
		//Queue<UngVien> dsuv = new LinkedList<>();
		Queue<UngVien> dsuv = new PriorityQueue<>((uv1,uv2)->uv1.getThoiDiem().compareTo(uv2.getThoiDiem()));
		//uu tien ai dang ki truoc
		
		dsuv.add(new UngVien("Lan")); // dang ki hom nay
		dsuv.add(new UngVien("Binh", LocalDateTime.now().minusDays(5)));
		dsuv.add(new UngVien("Hung", LocalDateTime.now().minusDays(4)));
		dsuv.add(new UngVien("Nga", LocalDateTime.now().minusDays(9)));
		dsuv.add(new UngVien("Thao", LocalDateTime.now().minusDays(10)));
		
		
		int i =0;
		while(i<n) {
			System.out.println(dsuv.poll());
			i++;
		}
	}
}
