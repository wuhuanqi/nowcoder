/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Permutation
 * Author:   user
 * Date:     2019/5/24 16:36
 * Description: 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。〉
 *
 * @author user
 * @create 2019/5/24
 * @since 1.0.0
 */
public class Permutation {
    public static void main(String[] args) {
        Permutation("lalalalasdsd");
    }
//先筛选出distinct的字符
public static ArrayList<String> Permutation(String str) {
    //哈希map这样用的啊宝贝！！！！！！！！！！！
    Map<Character, Integer> hashMap = new HashMap<>();
    for (int i=0;i<str.length();i++){
        if (!hashMap.containsKey(str.charAt(i)))
            hashMap.put(str.charAt(i),1);

    }
    char[] array = new char[hashMap.size()];
    int i=0;
    for (Character c:hashMap.keySet()) {
        array[i]=c;
        i++;
    }

//    for (Character c:array) {
//        System.out.println(c);
//
//    }


    return null;

}

}
