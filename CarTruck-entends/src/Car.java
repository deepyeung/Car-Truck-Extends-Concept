public class Car {

    public int speed = 100;
    public int distance = 10000;
    private int gas = 200;

    int distance (){
        return distance;
    }

    /**
     *
     * @return
     */
    int gasNeed (){
        return distance/speed;
    }
}
