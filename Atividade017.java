import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade017 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[10];
  
         
         for (int i = 0; i < vetA.length; i++){
         
         vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com as idades no vetor A, na posição ["+(i+1)+"]."));
         
         
         
         }
          int maior35 = 0;
         for (int i = 0; i < vetA.length; i++){
         
        if (vetA[i]>35){
        
        maior35++;
        
        }  }
           
         
         
         JOptionPane.showMessageDialog(null, "Há "+maior35+" pessoas com mais de 35 anos.");
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
  
    }
}
