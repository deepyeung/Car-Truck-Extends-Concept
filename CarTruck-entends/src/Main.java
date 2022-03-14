
public class Main {
    public static void main(String[] args){

        Car car = new Car();
        Truck truck = new Truck();

        System.out.println("Car油量計算" + "=" + "距離" + "/" + "速度");
        System.out.println("Car需要油量" + "=" + car.gasNeed()+ "毫升");
        System.out.println("Truck油量計算" + "=" + "油量" + "*" + "貨物");
        System.out.println("Truck需要油量" + "=" + truck.oilUsed()+ "毫升");

    }
}
