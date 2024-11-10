public class Camera extends Product{ //Derived class, Sub class, Child class

    String imageProcessor;
    float cameraInMegaPixels;
    boolean isMirrorless;

    public Camera(){
        super();
        System.out.println("Camera constructor is invoked..");
    }

    public Camera(int id, String name, String brand, float price, float discountPercentage, float rating, String condition, String imageProcessor, float cameraInMegaPixels, boolean isMirrorless) {
        super(id, name, brand, price, discountPercentage, rating, condition);
        this.imageProcessor = imageProcessor;
        this.cameraInMegaPixels = cameraInMegaPixels;
        this.isMirrorless = isMirrorless;
    }

    void displayDetails(){
        /*System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Rating : " + rating);*/
        super.displayDetails();
        System.out.println("Image Processor : " + imageProcessor);
        System.out.println("Camera In MegaPixels : " + cameraInMegaPixels);
        System.out.println("Is Mirrorless : " + isMirrorless);
    }

}
