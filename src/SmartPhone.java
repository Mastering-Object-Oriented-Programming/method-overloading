public class SmartPhone extends Mobile{//Child class

    String keyboardType;

    public SmartPhone(){
        super();
        System.out.println("SmartPhone() constructor invoked..");
    }

    public SmartPhone(int id, String name, String brand, float price, float discountPercentage, float rating, String condition, float processor, float ramSize, String celluarTechnology, String keyboardType) {
        super(id, name, brand, price, discountPercentage, rating, condition, processor, ramSize, celluarTechnology);
        this.keyboardType = keyboardType;
    }


}
