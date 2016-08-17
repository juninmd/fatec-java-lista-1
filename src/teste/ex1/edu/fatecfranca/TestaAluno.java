package teste.ex1.edu.fatecfranca;

import ex1.br.edu.fatecfranca.Aluno;
import javax.swing.JOptionPane;

public class TestaAluno {

    public static void main(String[] args) {
       Aluno aluno1 = new Aluno();
       aluno1.idade = 19;
       aluno1.nome = "João";
       aluno1.numeroAluno = 1;
       aluno1.p1 = 7.6f;
       aluno1.p2 = 10;
       
      JOptionPane.showMessageDialog(null,aluno1.dadosAluno());      
      JOptionPane.showMessageDialog(null,"Média do aluno: "+aluno1.notaFinal());
      JOptionPane.showMessageDialog(null,aluno1.passou());    
    }
}
