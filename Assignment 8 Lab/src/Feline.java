public class Feline extends Animal {

    public Feline(String name, String gender, String genus, int felines, int maxFelines) {
        super( name, gender, genus, 40 );   //default speed for feline is 40
        generateMood( felines, maxFelines );
    }

    @Override
    public void generateMood( int felines, int maxFelines ) {
        if( felines == 1 ){
            this.mood = "unhappy";
        } else if( felines < maxFelines ){
            this.mood = "unhappy";
        } else {
            this.mood = "happy";
        }
    }

}
