public class Assignment_2_b {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.length = 25;

        Ford fordM1 = new Ford();
        fordM1.manufacturerDiscount = 15;
        fordM1.year = 2017;

        Ford fordM2 = new Ford();
        fordM2.manufacturerDiscount = 8;
        fordM2.year = 2019;

        Truck tata = new Truck();
    }
}

class Car {
    int speed;
    private double regularPrice;
    String color;

    Car() {
        speed = 60;
        regularPrice = 500000;
        color = "Black";
    }

    double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car{
    int weight;

    Truck() {
        super();
        weight = 1000;
    }

    @Override
    double getSalePrice() {
        if(weight > 2000)
            return (0.9)*super.getSalePrice();
        else
            return (0.8)*super.getSalePrice();
    }
}

class Ford extends Car {
    int year;
    int manufacturerDiscount;

    Ford() {
        super();
        year = 2010;
        manufacturerDiscount = 10;
    }

    @Override
    double getSalePrice() {
        return super.getSalePrice()*(100 - manufacturerDiscount)/100;
    }
}

class Sedan extends Car {
    int length;

    Sedan() {
        super();
        length = 15;
    }

    @Override
    double getSalePrice() {
        if(length > 20)
            return 0.95*super.getSalePrice();
        else
            return 0.9*super.getSalePrice();
    }
}