import java.util.HashMap;

/**
 * ��һ�仰���ܼ�����<br> 
 * ��test��
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
    //��ϣ�����ȸ���next�ڵ������Ȼ���չ�ϣ��ȥ����random�ڵ�
    public static RandomListNode Clone(RandomListNode pHead)
    {
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        if(pHead==null) return  null;
        RandomListNode pCur=pHead;
        //�ȸ������нڵ�
        while (pCur!=null){
            RandomListNode node = new RandomListNode(pCur.label);
            map.put(pCur,node);
            pCur=pCur.next;
        }
        pCur=pHead;//����Pcur
        //����next
        while (pCur!=null){
            map.get(pCur).next=map.get(pCur.next);
            pCur=pCur.next;
        }
        pCur=pHead;//����Pcur
        //����random
        while (pCur!=null){
            map.get(pCur).random=map.get(pCur.random);
            pCur=pCur.next;
        }

        return map.get(pHead);
    }
    //���Ʋ�ַ�
    public static RandomListNode Copy(RandomListNode pHead){
        if (pHead==null) return null;
        RandomListNode pCur=pHead;
        //��ԭ���������ϸ����Լ�����ڵ�
        //A->B->C->D
        //A->A'->B->B'->C->C'
        while (pCur!=null){
            RandomListNode node = new RandomListNode(pCur.label);
            node.next=pCur.next;
            pCur.next=node;
            pCur=node.next;
        }
        //��A'->C'��'����ʾ���λ��
        pCur=pHead;

        while (pCur!=null){
            if (pCur.random!=null)
            {
                pCur.next.random=pCur.random.next;
            }
            pCur=pCur.next.next;
        }
        //��ԭ���������в��������
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