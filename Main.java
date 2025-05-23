import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) throws MyEmptyStackException {

        Stack stack = new StackLinkedList();
        try {
            stack.pop();
        }catch (Exception e){
            System.out.println(e);
        }

        /*
        ArrayList<String> stringList = new ArrayList();
        stringList.add("String");
        stringList.add("Aysi");
        System.out.println(stringList);

        HashMap<String, Double> grades = new HashMap();
        grades.put("Aysi", 15.0);
        grades.put("Cemo", 15.0);
        grades.put("Azo", 15.0);
        System.out.println(grades);
        grades.put("Aysi", 100.0);
        System.out.println(grades);

         */
    }
}