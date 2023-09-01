public class teste2 {
    public static void main (String[] args) {
        int nota = 11;
        String graduacao;

        // A= 8- B= 7 - C= 6 - D= 0
        if (nota >= 8) {
            graduacao = "A";
        } else if (nota < 8 && nota >= 7) {
            graduacao = "B";
        } else if (nota < 7 && nota >= 6) {
            graduacao = "C";
        } else if (nota < 6 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aprovado!");
                break;
            case "C":
                System.out.println("Recuperação.");
                break;
            case "D":
                System.out.println("Reprovado.");
                break;
            default:
                System.out.println("Inválida");

        }
    }
}
