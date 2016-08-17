package teste.ex3.edu.fatecfranca;
import ex3.br.edu.fatecfranca.Produto;
import javax.swing.JOptionPane;

public class TestaProduto {

    public static void main(String[] args) {
       Produto videogame = new Produto();
       videogame.id = 1;
       videogame.descricao = "Playstation";
       videogame.preco = 300.00f;
       videogame.qtde = 34;
       
       videogame.subir(8);
       
       if(videogame.descer(4) == false){
           JOptionPane.showMessageDialog(null, "Não foi possível descer o preco do produto "+ videogame.descricao);
       }
       
       videogame.comprar(10);
       if(videogame.vender(30) == false){
           JOptionPane.showMessageDialog(null, "Não foi possível realizar a venda, produto "+ videogame.descricao +" indisponível.");
       }     

       JOptionPane.showMessageDialog(null, videogame.mostra());
       
       Produto computador = new Produto(2, "Apple", 6, 2000);
       computador.subir(800);
       
       if(computador.descer(400) == false){
           JOptionPane.showMessageDialog(null, "Não foi possível descer o preco do produto "+ computador.descricao);
       }
       
       computador.comprar(10);
       
       if(computador.vender(300) == false){
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a venda, produto "+ computador.descricao +" indisponível.");
       }       

       JOptionPane.showMessageDialog(null, computador.mostra());
    }
}
