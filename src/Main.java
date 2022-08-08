import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("kien",30,"Hn");
        Student student1 = new Student("Nam",26,"HN");
        Student student2 = new Student("Anh",38,"HT");
        Student student3 = new Student("Tung",38,"Ht");

        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(lists);
        for (Student st : list){
            System.out.println(st.toString());

        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("so sanh theo tuoi");
        for (Student st : lists){
            System.out.println(st.toString());
        }

    }
}



