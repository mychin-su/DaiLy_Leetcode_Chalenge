package _SourceCode;

import java.util.Stack;

public class Implement_Queue_using_Stack_232 {
	public class MyQueue {
		Stack<Integer> mainStack = new Stack<Integer>(); // s1
		Stack<Integer> reverseStack = new Stack<Integer>(); // s2

		/** Initialize your data structure here. */
		public MyQueue() {

		}

		/**Push element x to the back of queue*/
		public void push(int x) {
			mainStack.push(x);
		}

		/**Push element x to the back of queue*/
		public int pop() {
			if (reverseStack.isEmpty()) {
				while (!mainStack.isEmpty()) {
					reverseStack.push(mainStack.pop());
				}
			}
			return reverseStack.pop();
		}

		public int peek() {
			if(reverseStack.isEmpty()) {
				while(!mainStack.isEmpty()) {
					reverseStack.push(mainStack.pop());
				}
			}
			return reverseStack.peek();
		}

		public boolean empty() {
			return mainStack.isEmpty() && reverseStack.isEmpty();
		}
	}
}
