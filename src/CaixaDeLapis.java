public class CaixaDeLapis {
    private static CaixaDeLapis unicaCaixa;

    private CaixaDeLapis() {
        System.out.println("Caixa de lápis criada!");
    }

    public static CaixaDeLapis getCaixa() {
        if (unicaCaixa == null) {
            unicaCaixa = new CaixaDeLapis();
        }
        return unicaCaixa;
    }

    public void usarLapis(String aluno) {
        System.out.println(aluno + " está usando a caixa de lápis.");
    }
}
