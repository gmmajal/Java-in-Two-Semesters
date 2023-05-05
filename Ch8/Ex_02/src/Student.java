public class Student {
    private String studentNumber;
    private String studentName;
    private int markForMaths;
    private int markForEnglish;
    private int markForScience;
    private static double fee;

    public Student(String stNum, String stName){
        studentNumber = stNum;
        studentName = stName;
        markForMaths = 70;
        markForEnglish = 85;
        markForScience = 65;
        fee = 3000;
    }

    public String getNumber(){
        return studentNumber;
    }

    public String getName(){
        return studentName;
    }

    public void enterMarks(int math, int eng, int sci){
        markForMaths = math;
        markForEnglish = eng;
        markForScience = sci;
    }

    public int getMathMarks(){
        return markForMaths;
    }

    public int getMarkForEnglish(){
        return markForEnglish;
    }

    public int getScienceMark(){
        return markForScience;
    }

    public double getAverageMark(){
        return (markForEnglish + markForMaths + markForScience) / 3.0;
    }

    public static double getFee(){
        return fee;
    }

    public static void setFee(double f){
        fee = f;
    }


}