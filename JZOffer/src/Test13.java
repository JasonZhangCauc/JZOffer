/**
 * 
 * 剑指offer编程题（JAVA实现)——第13题：调整数组顺序使奇数位于偶数前面
 * 
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 */
public class Test13 {
	//为了保证位置，采用类似冒泡排序的方法，每次排相邻两个数
    public void reOrderArray(int [] array) {
    	int length=array.length-1;
        int tmp;
    	for(int i=0;i<length;i++) {
    		for(int j=length;j>i;j--) {
    			tmp=array[j]%2;
    			if(tmp!=array[j-1]%2&&tmp==1) {//奇数在后面则调换
    				tmp=array[j];
    				array[j]=array[j-1];
    				array[j-1]=tmp;
    			}
    		}
    	}
    }
    

}
