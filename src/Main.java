import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Product product= new Product();
        System.out.println("Name : "+product.name);

        /*Mobile mobile = new Mobile();
        System.out.println("Processor : " + mobile.processor);
        System.out.println("Price : " + mobile.price);

        Laptop laptop = new Laptop();
        System.out.println("Operating System : " + laptop.operatingSystem );
        System.out.println("Price : " + laptop.price);

        Camera camera = new Camera();
        System.out.println("Is Mirrorless : " + camera.imageProcessor);
        System.out.println("Price : " + camera.price);*/

        Mobile mobile = new Mobile(111, "Iphone 14 Pro Max", "Apple", 850.5F, 8.5F, 4.5F, "NEW", 2.3F, 16F, "56");
        /*
        Mobile m;
        m IS-A Mobile
        mobile IS-A Mobile
        mobile IS-A Product
        mobile IS-A Object
        */
        /* System.out.println("Processor : " + mobile.processor);
        System.out.println("Price : " + mobile.price);*/

        Laptop laptop =  new Laptop(222, "MacBook Pro", "Apple", 1234.5F, 6.5F, 4.9F, "OlD",  2.6F, 16F, "Mac");
        /*
        laptop IS-A Laptop
        laptop IS-A Product
        */
        /*System.out.println("Operating System : " + laptop.operatingSystem );
        System.out.println("Price : " + laptop.price);*/

        Camera camera = new Camera(333, "Sony Alpha 4", "Sony", 2345F,4.5F,3.5F, "New", "Digit8",34.4F,true);
        /*
        camera IS-A Camera
        camera IS-A Product
        */
        /*System.out.println("Is Mirrorless : " + camera.imageProcessor);
        System.out.println("Price : " + camera.price);*/

        mobile.displayDetails();
        laptop.displayDetails();
        camera.displayDetails();
        System.out.println("-------------------------------------");
        SmartPhone smartPhone = new SmartPhone();

        SmartPhone smartPhone1 = new SmartPhone(444, "Smasung Galaxy", "Samsung", 3423.23F, 4.5F, 4.5F, "New", 2.6F, 32F, "5G","Google");

        smartPhone1.displayDetails();
        /*
        smartPhone1 IS-A SmartPhone
        smartPhone1 IS-A Mobile
        smartPhone1 IS-A Product
        smartPhone1 IS-A Object

        smartPhone1 HAS-A id
        smartPhone1 HAs-A name
        smartPhone1 HAs-A processor
        smartPhone1 HAS-A keyboardType
        smartPhone1 HAS-A displayDetails()
         */
        System.out.println("-------------------------------------");
        SomeUsefulClass useful = new SomeUsefulClass();
        useful.process(smartPhone1);

        smartPhone1.displayProducts();
        System.out.println("-------------------");
        smartPhone1.displayProducts(4.5f);
        smartPhone1.displayProducts("5G");
        smartPhone1.displayProducts(1000f, 2000f);


    }

}