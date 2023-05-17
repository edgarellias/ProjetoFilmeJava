package screenmatch.Principal;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(5);
        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(8);
        Serie lost = new Serie("Lost",2000 );
        lost.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);
        for(Titulo item : lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme  && filme.getClassificacao()> 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
    }
}
