import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade008 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){ 
            
               int [] vetA = new int[10];
         
         int [] vetB = new int[vetA.length];
         
         int [] vetC = new int[vetA.length];
         
         for (int i = 0; i < vetA.length; i++){
         
         vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor A na posição ["+(i+1)+"]."));
         }
         
          for (int i = 0; i < vetA.length; i++){
         
         vetB[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor B na posição ["+(i+1)+"]."));
         
         
         vetC[i] = vetA[i]*vetB[i];
         }
         
         for (int i = 0; i < vetA.length; i++){
         
         JOptionPane.showMessageDialog(null, "Vetor A posição ["+(i+1)+"]: "+vetA[i]);
         
         } for (int i = 0; i < vetA.length; i++){
         
         JOptionPane.showMessageDialog(null, "Vetor B posição ["+(i+1)+"]: "+vetB[i]);
  
         } for (int i = 0; i < vetA.length; i++){
         
         JOptionPane.showMessageDialog(null, "Vetor C posição ["+(i+1)+"]: "+vetC[i]);
  
         }
         
         
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          
        }
  
    }
}
