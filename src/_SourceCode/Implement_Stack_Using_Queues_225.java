package _SourceCode;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_Using_Queues_225 {
	class MyStack {
		Queue<Integer> q = new LinkedList<Integer>();

		public MyStack() {

		}

		public void push(int x) {
			q.add(x);
			for (int i = 1; i < q.size(); i++) {
				q.add(q.remove());
			}
		}

		public int pop() {
			return q.remove();
		}

		public int top() {
			return q.peek();
		}

		public boolean empty() {
			return q.isEmpty();
		}
	}
}
