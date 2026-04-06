import java.util.Scanner;
public class Main{
public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    String frase;
    System.out.println("Digite sua frase:");
    frase = ler.nextLine();
    char[] cifrador = new char[frase.length()];
    
    for(int i = 0; i < frase.length(); i++){
        char letra = frase.toUpperCase().charAt(i);
        if(letra != ' ' && letra != '.'){
            cifrador[i] = letra;
        }
    }

    System.out.print(cifrador);
    // for(i; i < cifrador.length(); i++){
    //     i = (i + 5)%frase.length();
    //     System.out.print(i);
    // }
}
}