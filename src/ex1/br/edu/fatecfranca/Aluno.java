package ex1.br.edu.fatecfranca;
public class Aluno {
   public int numeroAluno;
   public String nome;
   public int idade;
   public float p1;
   public float p2;
   
   public Aluno(){
       this.numeroAluno  = 0;
       this.nome = "";
       this.idade = 0;
       this.p1 = 0f;
       this.p2 = 0f;
   }
   
   public float notaFinal(){
       return (this.p1 + this.p2) /2;
   }
    public String dadosAluno(){
       return "Número aluno: "+this.numeroAluno+"\n"+
               "Nome: "+this.nome+"\n"+
               "Idade: "+this.idade;
   }
     public String passou(){
       return this.nome + " "+(notaFinal() >= 6 ? "Passou" : "Rodou");
   }
}
