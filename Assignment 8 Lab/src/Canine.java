public class Canine extends Animal {

    public Canine( String name, String gender, String genus, int speed, int canines, int maxCanines ){
        super( name, gender, genus, speed );
        generateMood( canines, maxCanines );
    }

    @Override
    public void generateMood( int canines, int maxCanines ) {
        if( canines == 1 || canines < maxCanines ){
            this.mood = "happy";
        } else {
            this.mood = "unhappy";
        }
    }

}
