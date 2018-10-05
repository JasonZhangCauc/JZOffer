import java.util.Stack;

/**
 * 
 * 包含min函数的栈
 * 
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 *
 */
public class Test20 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.push(5);
		System.out.println(solution.min()+" "+solution.top());
		solution.pop();
		System.out.println(solution.min()+" "+solution.top());
		solution.push(6);
		System.out.println(solution.min()+" "+solution.top());
		solution.push(7);
		System.out.println(solution.min()+" "+solution.top());
		
	}

	
}
class Solution {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minstack = new Stack<>();

	public void push(int node) {
		stack.push(node);
		if (minstack.isEmpty()) {
			minstack.push(node);
		} else {
			if (node < minstack.get(minstack.size()-1)) {// 有更小的入栈
				minstack.push(node);
			} else {
				minstack.push(minstack.get(minstack.size()-1));
			}
		}
	}

	public void pop() {
		if(!stack.isEmpty()) {
			stack.pop();
			minstack.pop();
		}
	}

	public int top() {
		if(!minstack.isEmpty()) {
			int top = stack.get(stack.size()-1);
			return top;
		}
		return 0;
	}

	public int min() {
		if(!minstack.isEmpty()) {
			int min = minstack.get(minstack.size()-1);
			return min;
		}
		return 0;

	}
}