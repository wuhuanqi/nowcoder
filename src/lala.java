import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author user
 * @create 2019/5/22
 * @since 1.0.0
 */
public class lala {
    public static void main(String[] args) {
        System.out.println("*****************");
        RandomListNode node0 = new RandomListNode(0);
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        node0.next=node1;
        node1.next=node2;
        node2.next=node3;
        node0.random=node2;
        node1.random=node3;
        node2.random=node0;
        node3.random=node2;
        RandomListNode newlist=Copy(node0);
        System.out.println(newlist.label);


    }
    //哈希表法：先复制next节点的链表，然后按照哈希表去复制random节点
    public static RandomListNode Clone(RandomListNode pHead)
    {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        if(pHead==null) return  null;
        RandomListNode pCur=pHead;
        //先复制所有节点
        while (pCur!=null){
            RandomListNode node = new RandomListNode(pCur.label);
            map.put(pCur,node);
            pCur=pCur.next;
        }
        pCur=pHead;//更新Pcur
        //复制next
        while (pCur!=null){
            map.get(pCur).next=map.get(pCur.next);
            pCur=pCur.next;
        }
        pCur=pHead;//更新Pcur
        //复制random
        while (pCur!=null){
            map.get(pCur).random=map.get(pCur.random);
            pCur=pCur.next;
        }

        return map.get(pHead);
    }
    //复制拆分法
    public static RandomListNode Copy(RandomListNode pHead){
        if (pHead==null) return null;
        RandomListNode pCur=pHead;
        //在原来的链表上复制自己这个节点
        //A->B->C->D
        //A->A'->B->B'->C->C'
        while (pCur!=null){
            RandomListNode node = new RandomListNode(pCur.label);
            node.next=pCur.next;
            pCur.next=node;
            pCur=node.next;
        }
        //让A'->C'用'来表示随机位置
        pCur=pHead;

        while (pCur!=null){
            if (pCur.random!=null)
            {
                pCur.next.random=pCur.random.next;
            }
            pCur=pCur.next.next;
        }
        //从原来的链表中拆出新链表
//        RandomListNode pCloneHead = pHead.next;
//        RandomListNode tmp;
//        RandomListNode currNode = pHead;
//        while(currNode.next!=null){
//            tmp = currNode.next;
//            currNode.next =tmp.next;
//            currNode = tmp;
//        }
//        return pCloneHead;

        RandomListNode CloneHead=pHead.next;
        RandomListNode pCur1 =CloneHead;
        while (pCur1.next!=null){

                pCur1.next=pCur1.next.next;

            pCur1=pCur1.next;
        }

        return CloneHead;

    }

}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}