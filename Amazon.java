package amazon;

import java.util.ArrayList;
import java.util.Scanner;

public class Amazon {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        String text = id.nextLine();
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;


        ArrayList<String> texto = new ArrayList<>();
        for(int i = 0; i < text.length(); i++){
            texto.add(text.substring(i , i+1));
        }

        for(int i = 0; i < texto.size(); i++) {
            if (texto.get(i).equals("a") || texto.get(i).equals("b") || texto.get(i).equals("c") || texto.get(i).equals("d") || texto.get(i).equals("e") || texto.get(i).equals("f") || texto.get(i).equals("g") || texto.get(i).equals("h") || texto.get(i).equals("i")) {
                contador1 = contador1 + 1;
            }
            if (texto.get(i).equals("j") || texto.get(i).equals("k") || texto.get(i).equals("l") || texto.get(i).equals("m") || texto.get(i).equals("n") || texto.get(i).equals("o") || texto.get(i).equals("p") || texto.get(i).equals("q") || texto.get(i).equals("r")) {
                contador1 = contador1 + 2;
            }
            if (texto.get(i).equals("s") || texto.get(i).equals("t") || texto.get(i).equals("u") || texto.get(i).equals("v") || texto.get(i).equals("w") || texto.get(i).equals("x") || texto.get(i).equals("y") || texto.get(i).equals("z")) {
                contador1 = contador1 + 3;
            }
        }
        for(int i = 0; i < texto.size(); i++) {
            if (texto.get(i).equals("a") || texto.get(i).equals("d") || texto.get(i).equals("g") || texto.get(i).equals("j") || texto.get(i).equals("m") || texto.get(i).equals("p") || texto.get(i).equals("s") || texto.get(i).equals("v") || texto.get(i).equals("y")) {
                contador2 = contador2 + 1;
            }
            if (texto.get(i).equals("b") || texto.get(i).equals("e") || texto.get(i).equals("h") || texto.get(i).equals("k") || texto.get(i).equals("n") || texto.get(i).equals("q") || texto.get(i).equals("t") || texto.get(i).equals("w") || texto.get(i).equals("z")) {
                contador2 = contador2 + 2;
            }
            if (texto.get(i).equals("c") || texto.get(i).equals("f") || texto.get(i).equals("i") || texto.get(i).equals("l") || texto.get(i).equals("o") || texto.get(i).equals("r") || texto.get(i).equals("u") || texto.get(i).equals("x")) {
                contador2 = contador2 + 3;
            }
        }
            for(int i = 0; i < texto.size(); i++) {
                if (texto.get(i).equals("a") || texto.get(i).equals("b") || texto.get(i).equals("c") || texto.get(i).equals("d") || texto.get(i).equals("e") || texto.get(i).equals("f") || texto.get(i).equals("g") || texto.get(i).equals("h") || texto.get(i).equals("i")) {
                    contador3 = contador3 + 1;
                }
                if (texto.get(i).equals("j") || texto.get(i).equals("k") || texto.get(i).equals("l") || texto.get(i).equals("m") || texto.get(i).equals("n") || texto.get(i).equals("o") || texto.get(i).equals("p") || texto.get(i).equals("q") || texto.get(i).equals("r")) {
                    contador3 = contador3 + 2;
                }
                if (texto.get(i).equals("s") || texto.get(i).equals("t") || texto.get(i).equals("u") || texto.get(i).equals("v") || texto.get(i).equals("w") || texto.get(i).equals("x") || texto.get(i).equals("y") || texto.get(i).equals("z")) {
                    contador3 = contador3 + 3;
                }
        }

            if(contador1 < contador2 && contador1 < contador3){
                System.out.println(contador1);
            } else if (contador2 < contador1 && contador2 < contador3){
                System.out.println(contador2);
            }else if (contador3 < contador1 && contador3 < contador2){
                 System.out.println(contador3);
            } else if (contador1 == contador2 || contador1 == contador3){
                System.out.println(contador1);
            }
    }
}
