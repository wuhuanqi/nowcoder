/**
 * Copyright (C), 2015-2019, XXX���޹�˾
 * FileName: Convert
 * Author:   user
 * Date:     2019/5/24 14:23
 * Description: ��һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */


/**
 * ��һ�仰���ܼ�����<br> 
 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ�򡣡�
 *
 * @author user
 * @create 2019/5/24
 * @since 1.0.0
 */
public class Convert {
    static TreeNode tail=null;
    public static void main(String[] args) {
        //Ҫʵ���������������ݹ麯��ֻ��¼��ǰ�ĸ��ڵ�
    }
    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null)return tail;
        //����һ��ָ��ָ�������β�ڵ�
        ConvertSubTree(pRootOfTree);
        //��˫�������β�ڵ��ҵ���ǰ�ڵ�
        while (tail.left!=null){
            tail=tail.left;
        }
        return tail;

    }

    public  static void ConvertSubTree(TreeNode root){
        if (root==null) return ;

        if (root.left!=null)
            ConvertSubTree(root.left);
        if (tail!=null){
        tail.right=root;
        root.left=tail;
        tail=root;
        }else {
            //���tailΪ��
            tail=root;
        }
        if (root.right!=null)
        ConvertSubTree(root.right);


    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}