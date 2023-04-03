import java.util.*;
public class _7_BalancedParenthesis {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		_7_BalancedParenthesis mainobj = new _7_BalancedParenthesis();
		StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
		if (isBalanced(str, stack)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	public static boolean isBalanced(String str, StacksUsingArrays stack) throws Exception {
        Stack<Character> stk = new Stack<>();
        for(int ind = 0 ; ind<str.length() ; ind++){
            char ch = str.charAt(ind);
            if(stk.isEmpty() && ((ch=='}') || (ch==']') || (ch==')'))){
                return false;
            }
            if(ch=='{'){
                stk.push('}');
            }
            else if(ch=='('){
                stk.push(')');
            }
            else if(ch=='['){
                stk.push(']');
            }
            else{
                if(stk.pop()!=ch) return false;
            }
        }
        if(!stk.isEmpty()) return false;
        return true;	
	}

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}

