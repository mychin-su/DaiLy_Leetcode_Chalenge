package _SourceCode;

public class Valid_Parentheses_20 {
	public static class MyStack {
		class Node {
			char val;
			Node next;

			Node(char val) {
				this.val = val;
				next = null;
			}
		}

		Node topNode;

		public void push(char value) {
			Node newNode = new Node(value);
			if (isEmpty() == false) { // khong trong co phan tu
				newNode.next = topNode;
			}
			topNode = newNode;
		}

		public boolean isEmpty() {
			return topNode == null;
		}

		public char pop() {
			char value = topNode.val;
			topNode = topNode.next; // topNode.next == null nen topNode se gan bang null
			return value;
		}
	}

	public static boolean isValid(String s) {
		MyStack stack = new MyStack(); // stack nay khong dinh nghia trong Java Collection ma dc dinh nghia ham pop
										// push ben tren
		int n = s.length();
		for (int i = 0; i < n; i++) {
			char currChar = s.charAt(i);
			if (currChar == '(' || currChar == '[' || currChar == '{') {
				stack.push(currChar);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char prevChar = stack.pop();
				if (prevChar == '(' && currChar == ')' || prevChar == '[' && currChar == ']'
						|| prevChar == '{' && currChar == '}') {
					//

				} else {
					return false;
				}
			}
		}
		return stack.isEmpty() ? true : false;
	}

	public static void main(String[] args) {
		String s = ")(){}";
		System.out.println(isValid(s));
	}
}
