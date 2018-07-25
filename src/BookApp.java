import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Book> bookarr = new ArrayList<Book>();
        String title;
        String author;
         String description;
         double price;
        boolean inStock;
        int number;


        String input = "";
        while(!input.equalsIgnoreCase("q")) {
            printer("What is the name of the author?");
            author = keyboard.next();
            printer("What is the title?");
            title = keyboard.next();
            printer("What is the description?");
            description = keyboard.next();
            printer("Is it in stock? True or False?");
            inStock = keyboard.nextBoolean();
            printer("What is the price?");
            price = keyboard.nextDouble();
            printer("What number of books?");
            number = keyboard.nextInt();

            bookarr.add(new Book(title, author, description, price, inStock, number));

            printer("Do you have additional book to add");
            input = keyboard.next();
        }

        System.out.println();
    }

    private static void printer(String message){
        System.out.println(message);
    }
}
