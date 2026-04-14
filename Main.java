import java.util.Scanner;
public class Main{
public static void main(String[]args){
    Scanner ler = new Scanner(System.in, "Cp850");
    String frase;
    System.out.println("Digite sua frase:");
    frase = ler.nextLine();
    char[] cifrador = new char[frase.length()];
    
     for(int i = 0; i < frase.length(); i++){
     char letra = frase.toUpperCase().charAt(i);
char arrumado = String.valueOf(letra).replace("Á", "A").replace("É", "E").replace("Í", "I").replace("Ç", "C").replace("Ó", "O").replace("Ú", "U").replace(".", " ").replace(",", " ").replace(";", " ").replace(",", " ").replace(":", " ").replace(",", " ").replace(">", " ").replace(",", " ").replace("<", " ").replace(",", " ").replace("/", " ").replace(",", " ").replace("!", " ").replace(",", " ").replace("@", " ").replace(",", " ").replace("#", " ").replace(",", " ").replace("$", " ").replace(",", " ").replace("%", " ").replace(",", " ").replace("¨", " ").replace(" ", " ").replace("&", " ").replace(",", " ").replace("*", " ").replace(",", " ").replace("(", " ").replace(",", " ").replace(")", " ").replace(",", " ").replace("´", " ").replace(",", " ").replace("`", " ").replace(",", " ").replace("-", " ").replace(",", " ").replace("_", " ").replace(",", " ").replace("=", " ").replace(",", " ").replace("+", " ").replace(",", " ").replace("§", " ").replace(",", " ").replace("[", " ").replace(",", " ").replace("]", " ").replace(",", " ").replace("^", " ").replace(",", " "). replace("~", " ").replace(",", " ").replace("º", " ").replace(",", " ").replace("{", " ").replace(",", " ").replace("}", " ").replace(",", " ").replace("?", " ").replace(",", " ").replace("/", " ").replace(",", " ").replace("°", " ").replace("}", " ").charAt(0);
        letra = arrumado;
        if(letra != ' '){
            cifrador[i] = arrumado;
        }
        else{
            continue;
        }

        System.out.print(cifrador[i]);
    }
}
}