public class Node {
    public Book[] book=new Book[50];
    public int curr=0;
    public Node left,right;
    public Node(Book b){
         this.book[curr++]=b;
    }
}
