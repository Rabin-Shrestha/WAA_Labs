package Algorithms;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Rabin Shrestha on 12/11/2017.
 */
public class LinkedListDublicateRemove {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(Arrays.asList(1, 2, 3, 4, 5,4,5,3,2,1,5,7,8,6));
        ListNode head=null;
        ListNode temp=null;
        for (Integer x : hs) {
            if(head==null) {
                head = new ListNode(x);
                temp=head;continue;
            }
            temp.next=new ListNode(x);
            temp=temp.next;
        }

        // calling the function
        deleteDuplicates(head);


    }

    public static ListNode deleteDuplicates(ListNode node) {
        HashSet<Integer> hs = new HashSet<>();
        ListNode head = null;
        ListNode temp=node;
        while(temp!=null)
        {  System.out.println(temp.value);
            hs.add(temp.value);
            temp=temp.next;
        }
        for (Integer x : hs) {
            if(head==null) {
                head = new ListNode(x);
                temp=head;continue;
            }
            temp.next=new ListNode(x);
            temp=temp.next;
        }
        return head;
    }


    public static ListNode deleteDubs(ListNode node)
    {
        if(node==null)return null;
        if(node.next==null)return node;

        ListNode temp=node;

        while(temp.next!=null)
        {
            if(temp.value==temp.next.value)
            {
                temp.next=temp.next.next;
                temp=temp.next;
            }
        }
        return node;

      }


}
 class ListNode {
     Integer value;
     ListNode next;

    ListNode(Integer x) {
        this.value = x;
        next = null;
    }
}