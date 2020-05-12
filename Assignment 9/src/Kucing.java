public class Kucing extends Hewan {

    public Kucing(){

    }

    @Override
    public void suara() {
        System.out.println("Kucing mengeong");
    }

    //Overload
    public void suara(String s){

    }

    @Override
    protected void makan() {
        System.out.println("Kucing makan");
    }

    @Override
    public void duduk() {

    }

}
