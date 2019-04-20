package Other;

import com.sun.org.glassfish.gmbal.Description;

/**
 * @program: offer
 * @description:给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author: Mr.Q
 * @create: 2019-04-18 21:02
 **/
public class Power {
    public double Power(double base, int exponent) {
        double res = 0;
        if (equal(base,0)) {
            return 0;
        }
        if (exponent == 0) {
            return 1.0;
        }
        if (exponent > 0) {
            res = mutiply(base,exponent);
        }else {
            res = mutiply(1/base,-exponent);
        }
        return res;
    }

    public double mutiply(double base, int e) {
        double sum = 1;
        for (int i = 0; i < e; i++) {
            sum = sum * base;
        }
        return sum;
    }

    /**
    * @Description: 不能直接用等号（==）判断两个小数是否相等。如果两个小数的差的绝对值很小，
    *比如小于0.0000001，就可以认为它们相等。
    * @Param:
    * @return:
    * @Author: Mr.Q
    * @Date: 19-4-18
    */
    public boolean equal(double a, double b) {
        if (a - b < 0.000001 && a - b > -0.000001) {
            return true;
        }
        return false;
    }
}
