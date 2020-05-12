abstract public class Hewan implements Trick, Komunikasi {

    private int umur;
    private String nama;
    private int mata;
    private int mulut;

    abstract public void suara();

    public Hewan(){

    }

    protected void makan(){
        System.out.println("Makan");
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getMulut() {
        return mulut;
    }

    public void setMulut(int mulut) {
        this.mulut = mulut;
    }

}
