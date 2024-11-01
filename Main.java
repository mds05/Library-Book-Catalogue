import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BST b=new BST();
        System.out.println("Welcome to Library Catalogue");
        b.command();
        
        int n=0;
        while(true){
            try{
                System.out.print("Press command: ");
                n=sc.nextInt();
                sc.nextLine();
           }
           catch(Exception e){
               sc.nextLine();
               System.out.println("Only number is allowed");
               System.out.println("Try again");
               continue;
           }
           Book book;
           if(n==1|| n==2){
               System.out.print("Enter Title: ");
               String title=sc.nextLine();
               System.out.print("Enter Author Name: ");
               String author=sc.nextLine();
               System.out.print("Enter Year of Publication: ");
               int year=0;
               try{
                year=sc.nextInt();
                sc.nextLine();
           }
           catch(Exception e){
               sc.nextLine();
               System.out.println("Only number is allowed");
               System.out.println("Try again");
               continue;
           }
               if(n==1){
                   book=new Book(title,author,year);
                   b.root = b.add(b.root, book);
               }
               else{
                   Book asked=b.search(b.root,title,author,year);
                   if(asked!=null){
                       System.out.print(asked.title+" -> ");
                       System.out.print(asked.author+" -> ");
                       System.out.println(asked.year);
                   }
                   
               }
           }
           else if(n==6){
                System.out.println("System exited.Thank you");
                break;
           }
           else if(n==4){
            System.out.print("Enter year: ");
            int year=0;
            try{
                year=sc.nextInt();
                sc.nextLine();
           }
           catch(Exception e){
               sc.nextLine();
               System.out.println("Only number is allowed");
               System.out.println("Try again");
               continue;
           }
            b.printBooksByYear(b.root,year);
           }
           else if(n==5){
            b.command();
           }
           else if(n==3){
                System.out.print("Enter which year you want to delete: ");
                int year=sc.nextInt();
                b.deleteNode(b.root,year);
           }
           
        }
        sc.close();
    }
}
