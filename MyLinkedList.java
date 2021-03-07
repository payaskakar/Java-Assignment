package linkedlist;

public class MyLinkedList {

   public ListNode head;
   public void insert(int data){
       if(head==null) {
           head=new ListNode(data);             // handling null pointer exception
       }
       else {
           ListNode temp=head;
           while(temp.next != null)
           {
               temp=temp.next;
           }
           ListNode y=new ListNode(data);
           temp.next=y;
       }
   }

   public ListNode insertAtPosition(ListNode headNode, int position, int data){

           ListNode head = headNode;
           if (position == 1) {
               ListNode newNode = new ListNode(data);
               newNode.next = headNode;
               head = newNode;
           } else {
               while (position-- != 0) {
                   if (position == 1) {
                       ListNode newNode = new ListNode(data);
                       newNode.next = headNode.next;
                       headNode.next = newNode;
                       break;
                   }
                   headNode = headNode.next;
               }
           }
           return head;
       }


   public void delete(int NodeData)           // Node Data to be deleted
    {
        ListNode temp = head, prev = null;
        if (temp != null && temp.data == NodeData) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != NodeData) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
        prev.next = temp.next;
    }

    public void deleteAtPosition(int position){
        if (head == null)
            return;
        ListNode temp = head;
        if (position == 0)
        {
            head = temp.next;
            return;
        }
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        ListNode next = temp.next.next;
        temp.next = next;
    }


    public int center(){
       int centerPoint;
       ListNode fast=head;
       ListNode slow=head;

       while(fast!=null && fast.next != null){
           fast=fast.next.next;
           slow=slow.next;
       }
        return centerPoint=slow.data;
    }

    public ListNode reverse(ListNode head){
       ListNode prev=null;
       ListNode current=head;
       ListNode next=null;

       while(current != null){
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
       }
       head=prev;
       return head;
    }

    public int size(){
       ListNode temp=head;
       int size=1;          //indexing starts from 1
       while(temp.next!=null){
           temp=temp.next;
           size++;
       }
       return size;
    }

    public void iterator(){
    ListNode temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
       }
    }

   public void print()
    {
        ListNode temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

}

