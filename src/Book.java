
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private boolean inStock;
    private int number;
    NumberFormat formatter = new DecimalFormat("#0.00");
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Book() {
    }

    public Book(String title, String author, String description, double price, boolean inStock, int number) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }



    public String getDisplayText(){
        return "The author is " + author + ". \n" +
                "The title is " + title + ". \n" +
                 "The description is " + description + " \n" +
                  "The Price is " + NumberFOrmater(price*number) + ".";}

    public String getDisplayText2(){
        return "The author is " + author + ". \n" +
                "The title is " + title + ". \n" +
                "The description is " + description + " \n" +
                "The Price is: Out of Stock.";}


    @Override
    public String toString() {
        return ("Author: "+this.getAuthor()+ "\n" +
                " Title: "+ this.getTitle() + "\n" +
                " Description: "+ this.getDescription() + "\n" +
                " The price is:   " + NumberFOrmater(this.getPrice()));
    }

    public String NumberFOrmater(double form){

        return formatter.format(form);
    }
}
