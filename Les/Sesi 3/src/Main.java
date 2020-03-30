import model.*;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Binusian> binusianList = new ArrayList<>();

        Student student = new Student("BN2", "Owen","ST1","Computer Science");
        Binusian student2 = new Student("BN3", "Chandra", "ST2", "Computer Science");
        Lecturer lecturer1 = new Lecturer("BN4", "Budi", "D01", "10000000");
        Instructor instructor1 = new Instructor("BN5", "Siapa", "ST3", "Computer Science", "1500000");

        binusianList.add(student);
        binusianList.add(student2);
        binusianList.add(lecturer1);
        binusianList.add(instructor1);

        //biar lebih pendek
        //ArrayList<Binusian> binusianList2 = Arrays.asList( student, student2, lecturer1, instructor1 );

        //bisa juga
//        List<Binusian> x = Arrays.asList( student, student2, lecturer1, instructor1 );
//        ArrayList<Binusian> binusianList3 = new ArrayList<>(x);

        //binusianList3.addAll(x);          //mau add all lgsg atau lgsg dalam arraylist<>(x) bisa

        Student temp;
        if( student2 instanceof Student ){      //to make sure it is right, safe casting
            temp = (Student)student2;           //type casting
            temp.getMajor();
        }
        System.out.println(student2 instanceof Student);
        lecturer1.teaching();
        ((Student)student2).study();            //type casting baru bisa pake study();
        student.study();

        //manggil semua yang bisa ngajar
        for (Binusian b: binusianList){
            if( b instanceof Teacher ){
                ((Teacher) b).teaching();
            }
            if( b instanceof Student ){
                ((Student) b).study();
            }
        }
    }
}