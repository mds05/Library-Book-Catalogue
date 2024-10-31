public class BST {
    public Node root;
    public void command(){
        System.out.println("Command List:");
        System.out.println("1 to add books");
        System.out.println("2 to search book");
        System.out.println("3 to delete books(delete function not yet available)");
        System.out.println("4 to show all books");
        System.out.println("5 to view command list");
        System.out.println("6 to exit program");
    }
    public Node add(Node root,Book b){
        if(root==null){
            System.out.println("Book added: " + b.title + " (" + b.year + ")");
            return new Node(b);
        }
        if(b.year<root.book[0].year){
            root.left=add(root.left,b);
        }
        else if(b.year>root.book[0].year){
            root.right=add(root.right,b);
        }
        else{
            System.out.println("Book added: " + b.title + " (" + b.year + ")");
            root.book[root.curr++]=b;
        }
        return root; 
    }
    public Book search(Node root,String title,String author,int year){
        if(root==null){
            return null;
        }
        if(root.book[0].year<year){
            return search(root.right,title,author,year);
        }
        else if(root.book[0].year>year){
            return search(root.left,title,author,year);
        }
        else{
            for(Book book:root.book){
                if(book.title.equals(title) && book.author.equals(author)){
                    System.out.println("Match found");
                    return book;
            }
            }  
        }
        System.out.println("Match Not found");
            return null; 
    }
    public void printBooksByYear(Node root,int year){
        if(root==null){
            System.out.println("No books found");
            return ;
        }
        if(root.book[0].year<year){
            printBooksByYear(root.right,year);
        }
        else if(root.book[0].year>year){
            printBooksByYear(root.left,year);
        }
        else{
            for(Book book:root.book){
                if(book !=null){
                    System.out.println("Book -> Author");
                    System.out.print(book.title+" -> ");
                    System.out.println(book.author);
                }
            }  
        }
        

    }    
}
