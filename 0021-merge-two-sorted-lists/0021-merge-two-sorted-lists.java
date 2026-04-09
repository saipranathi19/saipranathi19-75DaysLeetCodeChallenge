class Solution {
    public ListNode mergeTwoLists(ListNode temp1, ListNode temp2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val >temp2.val)
            {
                cur.next = temp2;
                temp2=temp2.next;
                
            }
            else {
                cur.next = temp1;
                temp1=temp1.next;
            }
            cur = cur.next;
        }
            if(temp2!=null)
            {
                cur.next=temp2;
            }
            if(temp1!=null)
            cur.next=temp1;
         return dummy.next;
        
    }
}