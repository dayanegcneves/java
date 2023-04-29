/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogoDaVelha;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author daday
 */
public class Logica {
    public int jogador=1, nJogadas=0, jogarNovamente;
    
    public void preencher(JButton casa){
        if(casa.getText().equals("")){
            if(jogador == 1){
                casa.setText("X");
                jogador = 2;
                nJogadas++;
            }
            else {
                casa.setText("O");
                jogador = 1;
                nJogadas++;
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Já está preenchido");
        }
    }
    
    public void verificarVitoria(JButton q1, JButton q2, JButton q3, JButton q4, JButton q5, JButton q6, JButton q7, JButton q8, JButton q9){
        JButton[] botoes = {q1, q2, q3, q4, q5, q6, q7, q8, q9};
        
        if((q1.getText().equals("X") && q2.getText().equals("X") && q3.getText().equals("X")) ||
           (q4.getText().equals("X") && q5.getText().equals("X") && q6.getText().equals("X")) ||
           (q7.getText().equals("X") && q8.getText().equals("X") && q9.getText().equals("X")) ||
           (q1.getText().equals("X") && q4.getText().equals("X") && q7.getText().equals("X")) ||
           (q2.getText().equals("X") && q5.getText().equals("X") && q8.getText().equals("X")) ||
           (q3.getText().equals("X") && q6.getText().equals("X") && q9.getText().equals("X")) ||
           (q1.getText().equals("X") && q5.getText().equals("X") && q9.getText().equals("X")) ||
           (q3.getText().equals("X") && q5.getText().equals("X") && q7.getText().equals("X"))){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador 1, você venceu");
            
            jogarNovamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", jogador, jogador, icon)
        }
        else if((q1.getText().equals("O") && q2.getText().equals("O") && q3.getText().equals("O")) ||
           (q4.getText().equals("O") && q5.getText().equals("O") && q6.getText().equals("O")) ||
           (q7.getText().equals("O") && q8.getText().equals("O") && q9.getText().equals("O")) ||
           (q1.getText().equals("O") && q4.getText().equals("O") && q7.getText().equals("O")) ||
           (q2.getText().equals("O") && q5.getText().equals("O") && q8.getText().equals("O")) ||
           (q3.getText().equals("O") && q6.getText().equals("O") && q9.getText().equals("O")) ||
           (q1.getText().equals("O") && q5.getText().equals("O") && q9.getText().equals("O")) ||
           (q3.getText().equals("O") && q5.getText().equals("O") && q7.getText().equals("O"))){
            JOptionPane.showMessageDialog(null, "Parabéns Jogador 2, você venceu");
            reset(botoes);
        }
        else{
            if(nJogadas == 9){
                JOptionPane.showMessageDialog(null, "Deu velha...");
                reset(botoes);
            }
        }
    }
    
    public void reset(JButton[] botoes){
        for(int i=0; i<botoes.length; i++){
            botoes[i].setText("");
        }
        
        nJogadas = 0;
    }
    
    
    
}
