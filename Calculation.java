package main;

public class Calculation {
    static void mutiplication(String text1){
        String[] letter = text1.split("\"");
        int a = 0;
        for (int i = 0; i < letter[1].length(); i++) {
            a++;
        }
        letter[2] = letter[2].replaceAll("[ /]", "");
        letter[1] = letter[1].replaceAll("[ \"]", "");
        boolean as = main.ArabicNumber.bruteForce(letter[2]);
        if (as) {
            int arr = Integer.parseInt(letter[2]);
            if (arr > 0 & arr <11) {
                int num = Integer.parseInt(letter[2]);
                if (letter[2] == "0") {
                    System.out.println("Ошибка");
                    System.exit(0);
                }
                else{
                    a = a/num;
                    System.out.println("\""+letter[1].substring(0, a)+"\"");
                }
            }

        }
        else{
            System.out.println("Ошибка");
            System.exit(0);
        }
    }
}

