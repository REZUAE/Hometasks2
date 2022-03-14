import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task1 {


    public class SimpleCalculator {

        public static void main(String[] args) throws IOException{

            float firstNumberJavokhir, secondNumberJavokhir, sum , subtraction, product, quotient;

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("The program calculates sum , difference , product and quotient for two numbers.");
            System.out.println("Enter the first number(and press Enter): ");
            firstNumberJavokhir= Float.parseFloat(br.readLine());
            System.out.println("Enter the second number (and press Enter): ");
            secondNumberJavokhir= Float.parseFloat(br.readLine());

            sum = firstNumberJavokhir + secondNumberJavokhir;
            subtraction = firstNumberJavokhir - secondNumberJavokhir;
            product= firstNumberJavokhir * secondNumberJavokhir;
            quotient = firstNumberJavokhir / secondNumberJavokhir ;

            System.out.printf("You've entered two numbers , the first is : " + "%2.2f" , firstNumberJavokhir);
            System.out.printf(" and the Second number is: " + "%2.2f" , secondNumberJavokhir);


            System.out.println(); //blank area

            System.out.printf("Sum = " + "%2.2f, \n", + sum);
            System.out.printf("Difference = " + "%2.2f, \n", + subtraction);
            System.out.printf("Product = " + "%2.2f, \n", + product);
            System.out.printf("Quotient = " + "%2.2f, \n", +  quotient);

        }

    }
}
