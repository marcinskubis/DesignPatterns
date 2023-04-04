public class Main {
    public static void main(String[] args){
        var car1 = CarFactory.getCar(CarType.SUV);
        var car2 = CarFactory.getCar(CarType.SEDAN);
        System.out.println(car1.getDescription());
        System.out.println(car2.getDescription());
    }
}
