/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Sum_Solution
 * Author:   user
 * Date:     2019/5/26 15:42
 * Description: 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）〉
 *  位运算的题目基本靠积累，没有遇到过的话基本上是做不出的
 *  这道题目的精髓在于，用递归代替了循环，用&&代替了判断
 * @author user
 * @create 2019/5/26
 * @since 1.0.0
 */

public class Sum_Solution {
    public int Sum_Solution(int n) {
        int res=n;
        //新建一个没有用的bool就是为了利用短路特性，前面不满足的话，不会计算后面
        boolean t=(res!=0)&&((res+=Sum_Solution(n-1))!=0);
        return res;
    }
    //不用加减法求两数之和，这道题目的精髓在于5+7=12
    //在于^也就是异或运算，求出了个位数(未考虑进位)，得到了0002
    //用&运算记录了进位得到了1000
    //最后相加这两个数的值，此时进入循环求调用两数之和，妙！
    public int add(int num1,int num2){

        while(num2!=0){
            int no_carry=num1^num2;
            int carry=(num1&num2)<<1;
            num1=no_carry;
            num2=carry;
        }
        return num1;
    }
}
