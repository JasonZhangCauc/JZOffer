/**
 * 
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 */
public class Test12 {
	//0和1单独判断一下
	public double Power(double base, int exponent) {
		
		if (exponent == 0) {
			return 1;
		} else if (exponent == 1) {
			return base;
		}
		
		double tmp = base;
		if (exponent < 0) {

			while (exponent < 1) {
				base /= tmp;
				exponent++;
			}
			return base;
		}
		while (exponent > 1) {
			base *= tmp;
			exponent--;
		}
		return base;
	}

}
