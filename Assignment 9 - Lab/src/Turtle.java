public class Turtle extends Runner {

    public Turtle( String name, int distance ){
        super( name, distance );
        generateSpeed();
    }

    @Override
    public void generateSpeed(){
        int speed = rand.nextInt(25);
        ++speed;
        speed += 25;
        this.run_speed = speed;
    }

    @Override
    public void updateDistance() {
        int move = randomNumber(getRun_speed());
        int special_move = randomNumber(10);
        if( special_move > 7 ){
            special_move += 15;
        }
        move += special_move;
        this.distance += move;
    }

}
