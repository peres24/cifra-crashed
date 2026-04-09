import java.util.Scanner;
public class Main{
public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    String frase;
    System.out.println("Digite sua frase:");
    frase = ler.nextLine();
    char[] cifrador = new char[frase.length()];
    char[] pontos = {'.', ';', ':', '>', '<', '"', '!', '@', '#', '$', '%', '¨' , '&', '*', '(', ')', '´', '`', '-', '_', '=', '+', '§', '[', ']', '^', '~', 'º', '{', '}', '?', '/', '°'};
    
    //  for(int i = 0; i < frase.length(); i++){
    //     char letra = frase.toUpperCase().charAt(i);
    //     if(letra != ' ' && letra != '.'){
    //         cifrador[i] = letra;
    //     }
    //     else{
    //         continue;
    //     }
        for(int i = 0; i < frase.length(); i++){
        char letra = frase.toUpperCase().charAt(i);
        for(int j = 0; j < pontos.length; j++){
            if(letra != pontos[j]){
                cifrador[i] = letra;
        }
        else{
            continue;
        }
        }
        }
        System.out.print(cifrador);
    }
}