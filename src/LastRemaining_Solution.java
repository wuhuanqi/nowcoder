/**
 * Copyright (C), 2015-2019, XXX���޹�˾
 * FileName: LastRemaining_Solution
 * Author:   user
 * Date:     2019/5/26 15:25
 * Description: Լɪ������
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */

/**
 * ��һ�仰���ܼ�����<br> 
 * ��Լɪ�����⡵
 *ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,
 * ����������ˡ�HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ��
 * ����,�и���Ϸ��������:����,��С������Χ��һ����Ȧ��
 * Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
 * ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,
 * ��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,���Բ��ñ���,�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��
 * ������������,�ĸ�С���ѻ�õ������Ʒ�أ�(ע��С���ѵı���Ǵ�0��n-1)
 * @author user
 * @create 2019/5/26
 * @since 1.0.0
 */

import java.util.LinkedList;

/**
 * ��򵥵ķ�������дһ����������
 */

public class LastRemaining_Solution {

    public int LastRemaining_Solution(int n, int m) {
        //���Ȱ�С�����Ƕ���˫��������ȥ
        //LinkedList��Ȼ��˫������
        LinkedList<Integer> linkedList = new LinkedList<>();
        if (n==0||m==0) return -1;

        for (int i=0;i<n;i++){
            linkedList.add(i);
        }
        int bt = 0;
        while (linkedList.size()>1){
            //+���پ�������˺���ڶ��ٸ�������
            bt=(bt+m-1)%linkedList.size();
            //��̭��
            linkedList.remove(bt);
        }
        return linkedList.size()==1?linkedList.get(0):-1;
    }
}
