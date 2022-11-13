public class Book extends PriceException{

    double book_price;
    String book_name;

    public Book(String name, double price){
         this.book_price = 0;
         this.book_name = name;
    }

    public boolean equals(Book var2){
        if(var2.book_name.equals(this.book_name)){
            System.out.println("Books are equal");
            return true;
        } else {
            return false;
        }
    }
}
