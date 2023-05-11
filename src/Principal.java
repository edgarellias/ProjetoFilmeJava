public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Velozes e furiosos";
        meuFilme.anoDeLancamento = 2003;
        meuFilme.duracaoEmMinutos = 160;

        meuFilme.exibeFichaTecnica();
        meuFilme.somaDasAvaliacoes(10);
        meuFilme.somaDasAvaliacoes(3);
        meuFilme.somaDasAvaliacoes(8);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
