/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: permute
 * Author:   user
 * Date:     2019/5/27 15:27
 * Description: 回溯法之全排列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import org.omg.CORBA.INTERNAL;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈回溯法之全排列〉
 *
 * @author user
 * @create 2019/5/27
 * @since 1.0.0
 */
public class permute {
    //backtrack生成从第 i 个整数开始的所有排列
    public void backtrack(int n,ArrayList<Integer> nums,List<List<Integer>> output,int first)
    {
        //first用来记录已经排列的个数,相等说明已经拍完了
        if (first==n)
            //新建一个Arraylist把上一个复制进去呀！所以要新建！
            output.add(new ArrayList<Integer>(nums));
        for (int i=first;i<n;i++) {
            Collections.swap(nums, first, i);
            backtrack(n, nums, output, first + 1);
            // backtrack
            Collections.swap(nums, first, i);
        }



    }
    public List<List<Integer>> permute(int[] nums) {
        //新建一个返回的List<List>
        List<List<Integer>> output = new LinkedList();
        // convert nums into list since the output is a list of lists
        ArrayList<Integer> nums_lst = new ArrayList<Integer>();
        for (int num:nums) {
            nums_lst.add(num);
        }
        //n指的是元素个数
        int n = nums.length;
        backtrack(n, nums_lst, output, 0);
        return output;
    }

}
