import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade015 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[10];
  
         
         for (int i = 0; i < vetA.length; i++){
         
         vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor A na posição ["+(i+1)+"]."));
         
         
         
         }
            
         int impares = 0;
         for (int i = 0; i < vetA.length; i++){
     
             if ((vetA[i]%2)==1){
         impares++;
             }   
         }
         
          int pares = 0;
         for (int i = 0; i < vetA.length; i++){
     
             if ((vetA[i]%2)==0){
         pares++;
             }   
         }
         
        double porcentImpa = (impares*100)/10;
        double porcentPa = (pares*100)/10; 
         
         JOptionPane.showMessageDialog(null, porcentImpa+"% são impares.\n"+porcentPa+"% são pares.");
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
  
    }
}
