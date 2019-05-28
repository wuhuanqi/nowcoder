/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: isContinuous
 * Author:   user
 * Date:     2019/5/26 14:07
 * Description: 判断是不是顺子
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈判断是不是顺子〉
 *
 * @author user
 * @create 2019/5/26
 * @since 1.0.0
 */
public class isContinuous {
    public boolean isContinuous(int [] numbers) {
              //jokers最多有4张
        if (numbers.length!=5) return false;
        int min=0;
        //排序
        Arrays.sort(numbers);
        //计算王的数量
        int i;
        int jokers=0;
        for (i = 0;i<numbers.length;i++)
        {
            //有对子直接pass,保证了后面的判断条件成立
            if (numbers[i]==0) jokers++;
            else if ((i!=numbers.length-1)&&numbers[i]==numbers[i+1]) return false;


        }
        min=numbers[jokers];
        //计算最大值和最小值的差,此时的i记录的是最小值
        int max=numbers[4];

        if (max-min>=5)return false;
        else return true;


    }
}
