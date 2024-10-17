import java.util.Scanner;


class BookManagementSystem {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("0-Default\n2-Constructor with title and author\n3-Constructor with title, author, and price");
        int type = sn.nextInt();
        sn.nextLine(); 

        switch (type) {
            case 0:              
                Book bookDefault = new Book();
                bookDefault.print();
                break;

            case 2:
                String title2 = sn.nextLine();
                String author2 = sn.nextLine();
                Book bookTitleAuthor = new Book(title2, author2);
                bookTitleAuthor.print();
                break;
            case 3:
                String title3 = sn.nextLine();
                String author3 = sn.nextLine();
                double price3 = sn.nextDouble();
                Book bookComplete = new Book(title3, author3, price3);
                bookComplete.print();
                break;

            default:
                System.out.println("Invalid");
                break;
        }


    }
}



class Book {
     String title;
     String author;
     double price;


    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // print
    public void print() {
        if (price == 0.0) {
            System.out.println("The cost of the book " + title + " by the author " + author + " is not mentioned.");
        } else {
            System.out.println("The book " + title + " by the author " + author + " is of cost " + price);
        }
    }
}

 