/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Convert
 * Author:   user
 * Date:     2019/5/24 14:23
 * Description: 入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


/**
 * 〈一句话功能简述〉<br> 
 * 〈入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。〉
 *
 * @author user
 * @create 2019/5/24
 * @since 1.0.0
 */
public class Convert {
    static TreeNode tail=null;
    public static void main(String[] args) {
        //要实现这个场景，这个递归函数只记录当前的根节点
    }
    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null)return tail;
        //定义一个指针指向链表的尾节点
        ConvertSubTree(pRootOfTree);
        //从双向链表的尾节点找到最前节点
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
            //如果tail为空
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