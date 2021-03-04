package baekjoon;

import java.util.Scanner;

class Queue{
	private int[] queue;
	private int front = 0;
	private int back= -1;
	
	
	Queue(int number){
		queue = new int[number];
	}
	
	public void push(int x) {
		queue[++back] = x;
	}
	
	public int  pop() {
		if (Empty())
			return -1;
		else
			return queue[front++];
	}
	
	public int size() {
		return back - front + 1;
	}
	
	public boolean Empty() {
		if (size()==0)
			return true;
		else
			return false;
	}
	
	
	public int front() {
		if (Empty())
			return -1;
		else
			return queue[front];
	}
	
	public int back() {
		if (Empty())
			return -1;
		else
			return queue[back];
	}
	
}
public class Main10845 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Queue queue = new Queue(number);
		for(int i = 0; i <number; i++) {
			String command = sc.next();
			switch(command) {
				case "push":
					int x = sc.nextInt();
					queue.push(x);
					break;
				case "pop":
					System.out.println(queue.pop());
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "empty":
					if (queue.Empty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "front":
					System.out.println(queue.front());
					break;
				case "back":
					System.out.println(queue.back());
					break;
			}
		}
	}
}