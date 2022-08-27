import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade022 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[10];
                
          
               
         for (int i = 0; i < vetA.length; i++){
             
          vetA[i] = (int)Math.round(Math.random() * 1);    
             
         }
         
          double num0 = 0;
          for (int i = 0; i < vetA.length; i++){
         
          if (vetA[i]==0){
          
          num0++;
          
          }
          }
         
        double zeroporcent = (num0*100)/10;
        double umporcent = 100-zeroporcent;
        
         
          for (int i = 0; i < vetA.length; i++){
         
         JOptionPane.showMessageDialog(null, "Vetor A posição ["+(i+1)+"]: "+vetA[i]);
         
          }
          
          
          JOptionPane.showMessageDialog(null, "Porcentagem de números 0 = "+zeroporcent+"\nPorcentagem de números 1 = "+umporcent);
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
  
    }
}