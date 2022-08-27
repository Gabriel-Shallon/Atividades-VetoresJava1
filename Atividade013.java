import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade013 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[10];
         
         
         
         for (int i = 0; i < vetA.length; i++){
         
         vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor A na posição ["+(i+1)+"]."));
         
         
         
         }
         int pares = 0;
         for (int i = 0; i < vetA.length; i++){
        
             if ((vetA[i]%5)==0){
         pares++;
             }
             if (i==vetA.length-1){
             JOptionPane.showMessageDialog(null, "Há "+pares+" números multiplos de cinco no vetor A");
               
         } }
       
       
         
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
  
    }
}
