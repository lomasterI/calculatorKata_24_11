package main;

public class TextRepeat {
    public static void Calculator(String text1){

        String text = text1+="\"";
        String[] letter = text.split("\"");
        letter[2] = letter[2].replaceAll("[ *]","");
        boolean letter2 = main.ArabicNumber.bruteForce(letter[2]);
        int a = Integer.parseInt(letter[2]);
        var repeated = letter[1].repeat(a);
            if (a  <= 10) {
                if (repeated.length() > 39) {
                    System.out.print(repeated.substring(0, 40) + "...");
                } else {
                    System.out.print(repeated);
                }
                System.out.print("\n");
            }else{
                System.out.println("Ошибка! Значение второго аргумента выражения не может быть больше 10");
                System.exit(0);
        }
    }
}

