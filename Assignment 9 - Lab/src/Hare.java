public class Hare extends Runner {

    public Hare( String name, int distance ){
        super( name, distance );
        generateSpeed();
    }

    @Override
    public void generateSpeed(){
        int speed = rand.nextInt(50);
        ++speed;
        speed += 25;
        this.run_speed = speed;
    }

    @Override
    public void updateDistance() {
        int move = randomNumber(getRun_speed());
        this.distance += move;
    }

}
