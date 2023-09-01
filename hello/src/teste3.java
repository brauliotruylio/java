public class teste3 {
    public static void main (String[] args) {

        String nome = "Braulio";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String sobrenome = "Truylio";
        System.out.println(nome.equals(sobrenome));
        System.out.println(nome + " " + sobrenome);

        String novoNome = nome.toLowerCase();
        System.out.println(nome.equals(novoNome));
        System.out.println(nome.equalsIgnoreCase(novoNome));
    }
}
