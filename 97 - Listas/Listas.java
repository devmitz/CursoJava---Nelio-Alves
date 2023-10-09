import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        // Opcional ArrayList<String>();
        list.add("Maria");
        list.add("Bob");
        list.add("Alex");
        list.add("Ana");
        list.add(2, "Marco"); // Adiciona o Marco na posição 2.
        
        System.out.println("Tamanho da lista: " + list.size());

        for(String obj : list){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("Removendo a Ana");
        list.remove("Ana");

        System.out.println("Tamanho da lista: " + list.size());

        for(String obj : list){
            System.out.println(obj);
        }


        list.add("Ana"); // Adicionando a Ana para os outros testes.
        // Removendo todos que começam com a letra M
        System.out.println();
        System.out.println("Removendo todos que começam com a letra M:");
        list.removeIf( x -> x.charAt(0) == 'M'); // Predicado com função lambda
        for(String obj : list){
            System.out.println(obj);
        }


        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // Retornara -1 já que o Marco não existe.


        // Filtrando nomes que apenas começam com a letra A
        System.out.println();
        System.out.println("Procurando apenas nomes que começam com a letra A: ");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for(String obj : result){
            System.out.println(obj);
        }


        // Procurando o primeiro nome que começa com a letra A:
        System.out.println();
        System.out.println("Procurando o primeiro nome que começa com a letra A:");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        
    }
}
