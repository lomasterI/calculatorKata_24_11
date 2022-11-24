package main;
import java.util.Scanner;
public class Calculator {
    private static char operation;
    public static void Calculator(){

        while(true){
            Scanner text = new Scanner(System.in);
            String text1 = text.nextLine()+"\"";
            String[] Array = text1.split("\"");

            for (int i = 0; i < Array.length; i++) {
                if (Array[i].length() > 11) {
                    System.out.println("Ошибка! Длинна первого аргумента выражения не может быть более 10 символов");
                    System.exit(0);
                }
            }

            String[] ArrayOp = Array[2].split("[+-/*]");
            //for (int i = 0; i < Array.length; i++) {System.out.println(Array[i]);}
            operation = Array[2].charAt(ArrayOp[0].length());
            if ( Array.length == 4) {
                boolean number1 = main.ArabicNumber.bruteForce(Array[1]);
                boolean number2 = main.ArabicNumber.bruteForce(Array[3]);
                if(operation == '+') {
                    if(((number1 & !number2)|(!number1 & number2))){
                        System.out.println("Ошибка");
                        System.exit(0);
                        break;
                    }
                    else{
                        String str = Array[1].concat(Array[3]);
                        System.out.println("\""+str+"\"");
                    }
                }
                else if(operation == '-'){
                    String a = Array[3];
                    String b = Array[1].replace(a, "");
                    System.out.println(b);
                }
                else{
                    System.out.println("Ошибка");
                    System.exit(0);
                }
            }
            else if(operation == '*'){
                main.TextRepeat.Calculator(text1);
            }
            else if(operation == '/'){
                main.Calculation.mutiplication(text1);
            }
        }
    }
}
