import ScreenMatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Velozes e furiosos");
        meuFilme.setAnoDeLancamento(2003);
        meuFilme.setDuracaoEmMinutos(160);

        meuFilme.exibeFichaTecnica();
        meuFilme.somaDasAvaliacoes(10);
        meuFilme.somaDasAvaliacoes(3);
        meuFilme.somaDasAvaliacoes(8);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}
