/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.ex2.edu.fatecfranca;

import ex2.br.edu.fatecfranca.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author jr_ac
 */
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente maricota = new Cliente(1533,23, "Maricota");
        maricota.realizarDeposito(20);
        JOptionPane.showMessageDialog(null, maricota.DadosCliente());
        maricota.realizarSaque(3);
        JOptionPane.showMessageDialog(null, maricota.DadosCliente());
        
        Cliente joao = new Cliente(111,25, "João");
        joao.realizarDeposito(400);
        JOptionPane.showMessageDialog(null, joao.DadosCliente());
        joao.realizarSaque(12);
        JOptionPane.showMessageDialog(null, joao.DadosCliente());
    }
    
}
