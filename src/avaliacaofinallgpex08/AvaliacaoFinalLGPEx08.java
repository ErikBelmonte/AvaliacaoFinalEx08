package avaliacaofinallgpex08;

import javax.swing.JOptionPane;

/**
 * @author User
 */
public class AvaliacaoFinalLGPEx08 {
    public static void main(String[] args) {
        int cont, num = 0, contP;
        
        contP = 0;
        cont = 1;
        
        while (cont <= 10){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if (num > 0){
                contP++;
            }
        cont++;
        }
        JOptionPane.showMessageDialog(null, "Existem "+contP
                +" números positivos.");
    }
    
}
