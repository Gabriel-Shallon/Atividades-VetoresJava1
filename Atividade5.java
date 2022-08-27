import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade5 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            
               int [] vetA = new int[10];
         
         int [] vetB = new int[vetA.length];
         
         for (int i = 0; i < vetA.length; i++){
         
         vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor A na posição ["+(i+1)+"]."));
         
         vetB[i] = vetA[i]*i;
         
         }
         
         for (int i = 0; i < vetA.length; i++){
         
         JOptionPane.showMessageDialog(null, "Vetor A posição ["+(i+1)+"]: "+vetA[i]);
         
         } for (int i = 0; i < vetA.length; i++){
         
         JOptionPane.showMessageDialog(null, "Vetor B posição ["+(i+1)+"]: "+vetB[i]);
  
         }
         
         
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          
        }
    }
}
