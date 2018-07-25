public class BookApp {

    public static void main(String[] args){

        Book one = new Book();

        one.setAuthor("John Doe");
        one.setTitle("Hello World");
        one.setDescription("Welcoming book");
        one.setInStock(true);
        one.setPrice(10.2569);

        System.out.println(one.getDisplayText());
    }
}
