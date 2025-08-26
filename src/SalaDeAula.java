public class SalaDeAula {
    public static void main(String[] args) {
        CaixaDeLapis caixa1 = CaixaDeLapis.getCaixa();
        caixa1.usarLapis("Maria");

        CaixaDeLapis caixa2 = CaixaDeLapis.getCaixa();
        caixa2.usarLapis("João");

        if (caixa1 == caixa2) {
            System.out.println("É a mesma caixa de lápis! ✅");
        }
    }
}