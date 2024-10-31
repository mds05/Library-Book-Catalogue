public class Queue_LL{
    public QueueN head,tail;
    public boolean isEmpty(){
        return head==null;
    }
    public void enqueue(Node x){
        QueueN temp=new QueueN(x);
        if(head==null){
            head=temp;
            tail=temp;
            return;
        }
        tail.next=temp;
        tail=temp;
    }
    public Node dequeue(){
        if(isEmpty()){
            return null;
        }
        QueueN temp=head;
        head=head.next;
        if(head==null){
            tail=null;
        }
        return temp.node;
    }
    public Node peek(){
        if(isEmpty()){
            return null;
        }
        QueueN temp=head;
        return temp.node;
    }
}