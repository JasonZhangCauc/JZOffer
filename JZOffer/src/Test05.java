import java.util.Stack;
/**
 * 
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 */
public class Test05 {

    Stack<Integer> stack1 = new Stack<Integer>();//工具栈
    Stack<Integer> stack2 = new Stack<Integer>();//代队列栈
   
    public void push(int node) {
        while(!stack2.isEmpty()) {//每次出队列时将重新将栈2中的元素压回栈1
        	stack1.push(stack2.pop());
        }
    	stack1.push(node);
        while(!stack1.isEmpty()) {
        	stack2.push(stack1.pop());
        }
    }
    
    public int pop() {
    	return stack2.pop();
    
    }

}
