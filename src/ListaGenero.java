import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaGenero {
    public static void main(String[] args) {  

        ArrayList<String> ListaHomem = new ArrayList<>();
        ArrayList<String> ListaMulher = new ArrayList<>();
        
        ListaHomem.add("Homem");
        ListaMulher.add("Mulher");
       
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Digite seu nome e 'M/F' para o genero  ou 'Sair' para finalizar: ");

            String entrada = scan.nextLine();
            if(entrada.equalsIgnoreCase("Sair")) {
                break;
            } else {
                String[] partes = entrada.split(" ");
                if(partes.length == 2) {
                    String nome = partes [0];
                    String genero = partes[1];
                    if (genero.equalsIgnoreCase("M")) {
                        ListaHomem.add(nome);
                    } else if (genero.equalsIgnoreCase("F")) {
                        ListaMulher.add(nome);
                    }else {
                        System.out.println("Genero invalido");
                    }
                } else {
                    System.out.println("Genero invalido");
                    
                    System.out.println("Lista homem" + ListaHomem);
                    Collections.sort(ListaHomem);
                    System.out.println("lista Mulher" + ListaMulher);
                    Collections.sort(ListaMulher);
                    scan.close();
                }
            }
        }
    }
}