/**
 * Copyright (C), 2015-2019, XXX���޹�˾
 * FileName: Permutation
 * Author:   user
 * Date:     2019/5/24 16:36
 * Description: ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * ��һ�仰���ܼ�����<br> 
 * ������һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba����
 *
 * @author user
 * @create 2019/5/24
 * @since 1.0.0
 */
public class Permutation {
    public static void main(String[] args) {
        Permutation("lalalalasdsd");
    }
//��ɸѡ��distinct���ַ�
public static ArrayList<String> Permutation(String str) {
    //��ϣmap�����õİ���������������������������
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
