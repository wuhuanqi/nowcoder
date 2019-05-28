/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: N_Queen
 * Author:   user
 * Date:     2019/5/27 22:05
 * Description: N皇后问题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈N皇后问题〉
 * 这里是DFS递归方案，有主函数和递归函数，递归函数的返回值的题目要求的值。
 * 值得学习的地方有判断边界约束条件一个函数
 * 没有使用回溯法
 * 回溯法的解决方案不一样。
 * @author user
 * @create 2019/5/27
 * @since 1.0.0
 */
public class N_Queen {
    public int queen(int n){
        if (n<1) return 0;
        //记录已经放置的皇后位置
        int[] record = new int[n];
        return process(0,record,n);
    }

    public int process(int i,int[] record,int n){
        //i是从0~n-1,i=n说明已经全部放完
        if (i==n)
            return 1;
        int res = 0;
        for (int j=0;j<n;j++){
            //如果可以放置皇后
            if (isValid(record,i,j)){
                record[i]=j;
                res=res+process(i+1,record,n);
            }
        }
        return res;

    }
    public boolean isValid(int[] record ,int i,int j){
        for (int k=0;k<i;k++)
        {
            if (record[k]==j||Math.abs(k-i)==Math.abs(record[k]-j))
                return false;
        }
        return true;

    }

}
