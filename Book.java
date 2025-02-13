import java.util.Scanner;

public class Book {
    public String title;
    public String author;
    public int publicationyear;

    public Book()
    {
        this.title = "Untitled";
        this.author = "Unknown author";
    }
    public Book(String title,String author)
    {
        this.title = title;
        this.author = author;
    }
    public Book(String title,String author ,int publicationyear)
    {
        this.title=title;
        this.author = author;
        this.publicationyear = publicationyear;
    }
    public void display()
    {
        System.out.println("Title : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Publication year : "+ publicationyear);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book title : ");
        String usertitle = scanner.nextLine();
        System.out.println("Enter the author name : ");
        String userauthor = scanner.nextLine();
        System.out.println("Enter publication year : ");
        int useryear = scanner.nextInt();

        Book userBook = new Book(usertitle,userauthor,useryear);
        System.out.println("Book details : ");
        userBook.display();
        scanner.close();
    }
}
