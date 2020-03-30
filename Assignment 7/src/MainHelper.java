import java.util.ArrayList;

public class MainHelper {

    public void showCars(){
        System.out.println("1. Jeep");
        System.out.println("2. SUV");
        System.out.println("3. Sedan");
    }

    public void showMenu(){
        System.out.println("SHOWROOM");
        System.out.println("==============");
        System.out.println("1. Buy");
        System.out.println("2. Show");
        System.out.println("3. Exit");
    }

    public void viewData(ArrayList<Car> carList){
        for (Car car : carList) {
            System.out.println(car.getName());
        }
    }

    public void cls(){
        for ( int i = 0 ; i < 25 ; ++i ){
            System.out.println();
        }
    }
}
