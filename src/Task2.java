import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public class Bmi_Index {
        public static void main(String[] args) throws IOException{

            float heightJavokhir , weightJavokhir, bmiJavokhir;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("The Program will calculate your BMI");
            System.out.println("Enter your height in cm (and press Enter): ");
            heightJavokhir = Float.parseFloat(br.readLine())/100;
            System.out.println("Enter your weight in kg (and press Enter): ");
            weightJavokhir = Float.parseFloat(br.readLine());

            bmiJavokhir = (float) (weightJavokhir / (Math.pow(heightJavokhir, 2)));
            System.out.printf("Your BMI is: " + "%2.2f,  \n", bmiJavokhir);


            if (bmiJavokhir < 16){
                System.out.println("You are slim/skinny/suffering from starvation");
            } else if ((bmiJavokhir >= 16)&&(bmiJavokhir < 16.99)){
                System.out.println("You're emaciated");
            }else if ((bmiJavokhir >= 17)&&(bmiJavokhir < 18.49)){
                System.out.println("You're underweight");
            }else if ((bmiJavokhir >= 18.50)&&(bmiJavokhir < 22.99)){
                System.out.println("You're in a low range or the norm");
            }else if ((bmiJavokhir >= 23)&&(bmiJavokhir < 24.99)){
                System.out.println("You're in the high range of the norm");
            }else if ((bmiJavokhir >= 25)&&(bmiJavokhir < 27.49)){
                System.out.println("You're overweight ot pre-obese");
            }else if ((bmiJavokhir >= 27.50)&&(bmiJavokhir < 29.99)){
                System.out.println("You're overweight");
            }else if ((bmiJavokhir >= 30)&&(bmiJavokhir < 34.99)){
                System.out.println("You've 1st degree obesity");
            }else if ((bmiJavokhir >= 35)&&(bmiJavokhir < 39.99)){
                System.out.println("You've 2nd degree obesity");
            }else if ((bmiJavokhir > 40)){
                System.out.println("You've 3rd degree obesity");
            }








        }

    }
}
