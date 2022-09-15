public class Main {

    public static void main(String[] args) {

        //bad practise
        System.out.println("Ersin");
        System.out.println("Nurdan");
        System.out.println("Ayşe");

        System.out.println("-------------------");

        // arrays type1
        String[] students= {"Ersin", "Nurdan", "Ayşe"};

        // array type2
        String[] students2= new String[3];
        students2[0]= "Ersin2";
        students2[1]= "Nurdan2";
        students2[2]= "Ayşe2";

        //print array - bad practise
        for (int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }

        System.out.println("-------------------");

        //print array - good practise
        for(String student: students2){
            System.out.println(student);
        }
    }
}
