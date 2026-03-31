public class Main{
public static void main(String[]args){
    String frase = "Quero ser programador. Aprendi Java no Devisate. Marilia";
    String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    String cifrador[];
    for(int i = 0; i < frase.length(); i++){
        char letra = frase.toUpperCase().charAt(i);
        if(letra != ' ' && letra != '.'){
            cifrador = cifrador[letra];
        }
    }

    
}
}