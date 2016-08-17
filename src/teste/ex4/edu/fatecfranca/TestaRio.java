package teste.ex4.edu.fatecfranca;
 
import ex4.br.edu.fatecfranca.Rio;
import javax.swing.JOptionPane;

public class TestaRio {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Rio rio = new Rio();
        rio.nivel = 10;
        rio.nome = "Solimões";
        rio.poluido = false;
        rio.chover(30f);
        JOptionPane.showMessageDialog(null, rio.mostra());
        
        if(rio.ensolarar(23f) == false){
            JOptionPane.showMessageDialog(null, "O Rio "+rio.nome+" secou!");
        }
        JOptionPane.showMessageDialog(null, rio.mostra());
        
        Rio riob = new Rio("Negro", 2, true);
        riob.chover(34f);
        JOptionPane.showMessageDialog(null, riob.mostra());
        
        if(riob.ensolarar(70f) == false){
            JOptionPane.showMessageDialog(null, "O Rio "+riob.nome+" secou!");
        }
        riob.poluido = true;
        JOptionPane.showMessageDialog(null, riob.mostra());
    }
    
}
