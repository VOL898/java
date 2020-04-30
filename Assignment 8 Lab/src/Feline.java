public class Feline extends Animal {

    public Feline(String name, String gender, String genus, int speed, int felines, int maxFelines) {
        super( name, gender, genus, speed );
        generateMood( felines, maxFelines );
    }

    @Override
    public void generateMood( int felines, int maxFelines ) {
        if( felines == 1 || felines < maxFelines ){
            this.mood = "unhappy";
        } else {
            this.mood = "happy";
        }
    }

}
