import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args){
        ArrayList<Student> studentList = new ArrayList<>();
        Student st1 = new Student( "1234", "John Doe" );
        Student st2 = new Student( "5786", "Djames Knox" );
        studentList.add(st1);
        studentList.add(st2);

        for (int i = 0; i < studentList.size(); ++i){
            System.out.println("\n");
            if (i == 1) {
                studentList.get(i).enterMarks(76, 52, 88);
                Student.setFee(4000);
            }
            double f = Student.getFee();
            System.out.println("The tuition fee paid was " + f);
            System.out.println("\n");
            String studentName = studentList.get(i).getName();
            String studentNumber = studentList.get(i).getNumber();
            System.out.println("The student under consideration is " + studentName + " who has a number " + studentNumber);
            System.out.println("\n");

            int math  = studentList.get(i).getMathMarks();
            int english = studentList.get(i).getMarkForEnglish();
            int science = studentList.get(i).getScienceMark();

            System.out.println(" The marks obtained by the student in Math were " + math);
            System.out.println(" The marks obtained by the student in English were " + english);
            System.out.println(" The marks obtained by the student in Science were " + science);

            System.out.println("\n");

            double avgMarks = studentList.get(i).getAverageMark();
            System.out.println(" The average marks obtained by the student were " + avgMarks);
            System.out.println("\n");

        }
    }
}
