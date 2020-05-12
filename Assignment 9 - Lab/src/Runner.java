import java.util.Random;

abstract public class Runner implements Speed {

    Random rand = new Random();

    protected String name;
    protected int run_speed;
    protected int distance;

    abstract public void updateDistance();

    public int randomNumber(int bound){
        int ret = rand.nextInt(bound);
        ++ret;

        return ret;
    }

    public Runner( String name, int distance ){
        this.name = name;
        this.distance = distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getRun_speed() {
        return run_speed;
    }

    public int getDistance() {
        return distance;
    }

    public static Runner create(Type type, String name, int distance) {
	    if ( type.isHare() ) {
		    return new Hare(name, distance);
	    }

	    return new Turtle(name, distance);
    }
}
