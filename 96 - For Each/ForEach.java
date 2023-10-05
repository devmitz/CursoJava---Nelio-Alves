
public class ForEach {
    public static void main(String[] args) {
        String[] nomes = new String[] {"Maria", "Bob" , "Alex"};

        // For normal
        System.out.println("--- For Normal ---");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // For Each
        System.out.println("--- For Each ---");
        for (String x : nomes) {
            // Para cada objeto x contido em nomes faça...
            System.out.println(x);
        }
    }
}
