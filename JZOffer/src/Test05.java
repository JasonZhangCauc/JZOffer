import java.util.Stack;
/**
 * 
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 *
 */
public class Test05 {

    Stack<Integer> stack1 = new Stack<Integer>();//����ջ
    Stack<Integer> stack2 = new Stack<Integer>();//������ջ
   
    public void push(int node) {
        while(!stack2.isEmpty()) {//ÿ�γ�����ʱ�����½�ջ2�е�Ԫ��ѹ��ջ1
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
