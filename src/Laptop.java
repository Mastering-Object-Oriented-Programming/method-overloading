public class Laptop extends Product { //Derived class, Sub class, Child class

    float processor;
    float ramSize;
    String operatingSystem;

    public Laptop(){
        super();
        System.out.println("Laptop constructor is invoked..");
    }

    public Laptop(int id, String name, String brand, float price, float discountPercentage, float rating, String condition, float processor, float ramSize, String operatingSystem) {
        super(id, name, brand, price, discountPercentage, rating,condition);
        this.processor = processor;
        this.ramSize = ramSize;
        this.operatingSystem = operatingSystem;
    }

    void displayLaptopDetails(){
        /*System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Rating : " + rating);*/

        super.displayDetails();
        System.out.println("Processor : "+ processor);
        System.out.println("Ram Size : " + ramSize);
        System.out.println("Operating System : " + operatingSystem);
    }

}
