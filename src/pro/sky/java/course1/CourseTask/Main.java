package pro.sky.java.course1.CourseTask;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // сделать методо
        int[] mass = {3, 26, 1, 83, 56, 78, 93, 54, 23, 73, 8, 72};
        for (int i : changeMass(mass)) {
            System.out.println(i);
        }
    }
    public static int [] changeMass (int mass []) {
        for (int i = 0; i<mass.length; i++) {
            if (mass[i] % 2 == 0) {
                mass[i] = mass[i] + 1;
            }
        }
        return Arrays.copyOfRange(mass,2,7);
    }
}
