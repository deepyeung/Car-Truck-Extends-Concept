public class Truck extends Car {

    public int gas=10;
    private int distance=600;
    public int stock=40;

    /**
     *
     * @return
     */
    int gas (){
        return gas();
    }

    /**
     * Hello
     * @return
     */
    int oilUsed (){
        return gas*stock;
    }
}
