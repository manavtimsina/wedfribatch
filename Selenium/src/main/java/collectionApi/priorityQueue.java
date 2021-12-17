package collectionApi;


import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue pq = new PriorityQueue();
		pq.add(1234);
		pq.add(4567);
		pq.add(4567);
		
		
		System.out.println(pq.peek());
		System.out.println(pq.poll()); //gets the first element and  
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
