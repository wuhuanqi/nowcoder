/**
 * Copyright (C), 2015-2019, XXX���޹�˾
 * FileName: isContinuous
 * Author:   user
 * Date:     2019/5/26 14:07
 * Description: �ж��ǲ���˳��
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */


import java.util.Arrays;

/**
 * ��һ�仰���ܼ�����<br> 
 * ���ж��ǲ���˳�ӡ�
 *
 * @author user
 * @create 2019/5/26
 * @since 1.0.0
 */
public class isContinuous {
    public boolean isContinuous(int [] numbers) {
              //jokers�����4��
        if (numbers.length!=5) return false;
        int min=0;
        //����
        Arrays.sort(numbers);
        //������������
        int i;
        int jokers=0;
        for (i = 0;i<numbers.length;i++)
        {
            //�ж���ֱ��pass,��֤�˺�����ж���������
            if (numbers[i]==0) jokers++;
            else if ((i!=numbers.length-1)&&numbers[i]==numbers[i+1]) return false;


        }
        min=numbers[jokers];
        //�������ֵ����Сֵ�Ĳ�,��ʱ��i��¼������Сֵ
        int max=numbers[4];

        if (max-min>=5)return false;
        else return true;


    }
}
