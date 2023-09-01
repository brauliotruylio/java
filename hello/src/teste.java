public class teste {
    public static void main (String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = false;

        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);

        // Operador ternário

        String mensagem = fimDeSemana ? "É fim de semana!" : "Não é fim de semana.";
        System.out.println(mensagem);
    }
}
