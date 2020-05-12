package model;

public abstract class Binusian {
    private String id;    //seperti const di C
    private String name;

    public Binusian(String id, String name){
        this.id = id;
        setName(name);
    } //constructor (ctor)

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

