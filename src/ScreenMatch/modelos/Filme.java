package ScreenMatch.modelos;

public class Filme {
     private String nome;
     private int anoDeLancamento;
     private double somaDasAvaliacoes;
     private int totalDeAvaliacoes;
     private int duracaoEmMinutos;

     public  void exibeFichaTecnica(){
          System.out.println("Nome do filme: " + nome);
          System.out.println("Ano de lançamento : "+ anoDeLancamento);
          System.out.println("Duração em minutos: "+ duracaoEmMinutos);
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public void setAnoDeLancamento(int anoDeLancamento) {
          this.anoDeLancamento = anoDeLancamento;
     }

     public void setDuracaoEmMinutos(int duracaoEmMinutos) {
          this.duracaoEmMinutos = duracaoEmMinutos;
     }

     public void somaDasAvaliacoes(double nota) {
          somaDasAvaliacoes += nota;
          totalDeAvaliacoes++;
     }

     public double pegaMedia(){
          return somaDasAvaliacoes / totalDeAvaliacoes;
     }

     public int getTotalDeAvaliacoes(){
          return totalDeAvaliacoes;
     }
}


