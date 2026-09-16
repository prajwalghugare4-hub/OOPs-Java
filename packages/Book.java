package packages;

import java.util.Scanner;
  class Book {  
      String title;  
      String author;     
      double price;
           
      void accept(Scanner sc) {    
        System.out.print("Enter book title: "); 
        title = sc.nextLine();          
        System.out.print("Enter author: ");         
        author = sc.nextLine();         
         System.out.print("Enter price: ");         
         price = sc.nextDouble();         
         sc.nextLine();     
        }      
        
        void display() {         
        System.out.println("Book Title: " + title);        
         System.out.println("Author: " + author);         
         System.out.println("Price: " + price);     
        }
     } 
class BookDemo{
         public static void main(String[] args) {         
           Scanner sc = new Scanner(System.in);         
            Book b1 = new Book();         
            Book b2 = new Book();        
            Book b3 = new Book();          
            System.out.println("Enter details of Book 1:");         
            b1.accept(sc);          
            System.out.println("\nEnter details of Book 2:");         
            b2.accept(sc);          
            System.out.println("\nEnter details of Book 3:");         
            b3.accept(sc);          
            System.out.println("\n--- Book Details ---");         
            b1.display();          
            System.out.println(); b2.display(); System.out.println(); b3.display(); 
            sc.close();
         }
        }
        
        