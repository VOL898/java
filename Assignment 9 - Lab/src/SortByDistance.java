import java.util.Comparator;

public class SortByDistance implements Comparator<Runner> {
    public int compare( Runner a, Runner b ){
        int aDistance = a.getDistance();
        int bDistance = b.getDistance();

        return bDistance-aDistance;
    }
}
