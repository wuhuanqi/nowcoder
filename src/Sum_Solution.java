/**
 * Copyright (C), 2015-2019, XXX���޹�˾
 * FileName: Sum_Solution
 * Author:   user
 * Date:     2019/5/26 15:42
 * Description: ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C��
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */

/**
 * ��һ�仰���ܼ�����<br> 
 * ����1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
 *  λ�������Ŀ���������ۣ�û���������Ļ�����������������
 *  �����Ŀ�ľ������ڣ��õݹ������ѭ������&&�������ж�
 * @author user
 * @create 2019/5/26
 * @since 1.0.0
 */

public class Sum_Solution {
    public int Sum_Solution(int n) {
        int res=n;
        //�½�һ��û���õ�bool����Ϊ�����ö�·���ԣ�ǰ�治����Ļ�������������
        boolean t=(res!=0)&&((res+=Sum_Solution(n-1))!=0);
        return res;
    }
    //���üӼ���������֮�ͣ������Ŀ�ľ�������5+7=12
    //����^Ҳ����������㣬����˸�λ��(δ���ǽ�λ)���õ���0002
    //��&�����¼�˽�λ�õ���1000
    //����������������ֵ����ʱ����ѭ�����������֮�ͣ��
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
