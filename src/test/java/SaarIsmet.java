import java.util.Arrays;

public class SaarIsmet {
    public static void main(String[] args) {

        int num1 = 10, num2=20, sum;

        sum = num1 + num2;

        System.out.println("sum = " + sum);

        // integer olmaz

        String word = "Java, JavaScript, Python, JavaTypeScript";

        String[] arrWord = word.split(", ");

        System.out.println("Arrays.toString(arrWord) = " + Arrays.toString(arrWord));


    }
}
