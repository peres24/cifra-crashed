import java.util.Scanner;
public class Main{
public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    String frase;
    System.out.println("Digite sua frase:");
    frase = ler.nextLine();
    char[] cifrador = new char[frase.length()];
    String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    
    for(int i = 0; i < frase.length(); i++){
        char letra = frase.toUpperCase().charAt(i);
        if(letra != ' ' && letra != '.'){
            cifrador[i] = letra;
        }
    }

    System.out.print(cifrador);
    // for(i; i < frase.length(); i++){
    //     i = (i + 5)%{frase.length()};
        
    // }
}
}