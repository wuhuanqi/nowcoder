/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Test
 * Author:   user
 * Date:     2019/5/26 14:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author user
 * @create 2019/5/26
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        isContinuous is = new isContinuous();
        int[] a = {1,0,0,4,0};
        System.out.println(is.isContinuous(a));
        Sum_Solution sum_solution = new Sum_Solution();
        System.out.println(sum_solution.add(5,7));
        permute perm = new permute();
        int[] nums = {1,2,3};
        perm.permute(nums);
        N_Queen queen = new N_Queen();
        System.out.println(queen.queen(8));
    }


}
