/**
 * 
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η���
 *
 */
public class Test12 {
	//0��1�����ж�һ��
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
