public class Filme {
     String nome;
     int anoDeLancamento;
     double somaDasAvaliacoes;
     int totalDeAvaliacoes;
     int duracaoEmMinutos;

     void exibeFichaTecnica(){
          System.out.println("Nome do filme: " + nome);
          System.out.println("Ano de lançamento : "+ anoDeLancamento);
          System.out.println("Duração em minutos: "+ duracaoEmMinutos);
     }

     void somaDasAvaliacoes(double nota) {
          somaDasAvaliacoes += nota;
          totalDeAvaliacoes++;
     }

     double pegaMedia(){
          return somaDasAvaliacoes / totalDeAvaliacoes;
     }
}
