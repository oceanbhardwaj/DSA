/*package whatever //do not write package name here */

import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
			int b=sc.nextInt();
				int c=sc.nextInt();
				PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
				pq.add(a);
				pq.add(b);
				pq.add(c);
				System.out.println(pq.poll()+pq.poll());
	}
}