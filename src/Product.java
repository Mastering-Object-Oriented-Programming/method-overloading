public class Product { //Base class, Super class, Parent class

    int id;
    String name;
    String brand;
    float price;
    float discountPercentage;
    float rating;

    String condition;

    public Product(){
        System.out.println("Product constructor Invoked..");
    }

    public Product(int id, String name, String brand, float price, float discountPercentage, float rating, String condition) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.condition = condition;
    }

    void displayDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Rating : " + rating);
        System.out.println("Condition : " + condition);
    }

    void displayProducts(){
        System.out.println("Display All Products...");
    }

    void displayProducts(float minRating){
        System.out.println("Display all products with min rating : " + minRating);
    }

    void displayProducts(float minPrice, float maxPrice){
        System.out.println("Display all products with min price : " + minPrice + " and max price : " + maxPrice);
    }
//->Not allowed
//    List<Product> displayProducts(float minPrice, float maxPrice) {
//
//    }

    void displayProducts(String brand){
        System.out.println("Display all products from the brand : " + brand);
    }
//->Not allowed
//    void displayProducts(float discountPercentage){
//
//    }

}
