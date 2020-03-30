
public class Data {
    private Integer ID;
    private String name;
    private String titles;
    private Integer time;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }
    public String getName() {
        return name;
    }

    public String getTitles() {
        return titles;
    }

    public Integer getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public void setTime(Integer time) {
        this.time += time;
    }

    public Data(Integer ID, String name, String titles, Integer time) {
        this.ID = ID;
        this.name = name;
        this.titles = titles;
        this.time = time;
    }

    public void showData(){
        if(titles.equals("Mrs.")){
            System.out.printf("|CU%3d	|%-3s %-19s|%-3s hours|", ID, titles, name, time);
        }else {
            System.out.printf("|CU%3d	|%-3s %-20s|%-3s hours|", ID, titles, name, time);
        }
    }
}