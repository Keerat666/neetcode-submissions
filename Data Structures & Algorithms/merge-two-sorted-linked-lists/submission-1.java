class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // if (list1 == null && list2 == null) return null;

        // ArrayList<Integer> listValues = new ArrayList<>();

        // while(list1 != null) {
        //     listValues.add(list1.val);
        //     list1 = list1.next;
        // }

        // while(list2 != null) {
        //     listValues.add(list2.val);
        //     list2 = list2.next;
        // }
        // if (listValues.isEmpty()) return null;

        // Collections.sort(listValues);


        // ListNode head = new ListNode(listValues.get(0));
        // ListNode current = head;

        // for(int i=1; i < listValues.size(); i++)
        // {
        //     ListNode t = new ListNode(listValues.get(i));
        //     current.next = t;
        //     current = t;
        // }

        // return head;
        

        ListNode head = new ListNode();
        ListNode current = head;

        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                current.next=list1;
                list1=list1.next;
            }
            else
            {
                current.next=list2;
                list2=list2.next;
            }

            current= current.next;
        }

        if(list1!=null)
        {
            current.next=list1;
            list1=list1.next;
        }

        if(list2!=null)
        {
            current.next=list2;
            list2=list2.next;
        }

        return head.next;
    }
}