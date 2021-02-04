package collection;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
/*        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        System.out.printf("*********增强for修改************");
        for (String str : list) {
            str += "111";
            System.out.println(str);
        }

        System.out.printf("*********普通for遍历************");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.printf("*********增强for遍历************");
        for (String str : list) {
            System.out.println(str);
        }*/

/*        List<Student> list = new ArrayList<>();

        list.add(new Student("李云龙", 18));
        list.add(new Student("刘亦菲", 16));
        list.add(new Student("刘诗诗", 17));

        for(Student stu : list){
            stu.setName(stu.getName()+"1号");
            stu.setAge(15);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        for(Integer i : list){
            i+=9;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    }
