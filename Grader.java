import java.util.*;
public class Grader {

    public static void main (String []args){
        //generateInput();
        adjustInputGrades();
    }

    private static void generateInput() {
        for (int i = 0; i < 20; ++i) {
            var grade = (int)(Math.random()*76+30);
            System.out.println(grade + "\t" + adjustGrade(grade));
        }
    }

    private static void adjustInputGrades() {
        Scanner keyboard = new Scanner(System.in);
        var numStudents = keyboard.nextInt();
        for (int i=0; i < numStudents; ++i) {
            var grade = keyboard.nextInt();
            grade = adjustGrade(grade);
            System.out.println(grade);
        }
    }

    private static int adjustGrade(int grade) {
        var diffFrom5 = grade%5;
        if (diffFrom5 > 2 && grade > 37) {
            grade += 5 - diffFrom5;
        }
        return grade;
    }
}
