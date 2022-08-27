import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade012 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[10];
         
         
         
         for (int i = 0; i < vetA.length; i++){
         
         vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor A na posição ["+(i+1)+"]."));
         
         
         
         }
         int num = 0;
         for (int i = 0; i < vetA.length; i++){
         
             num = num+vetA[i];
             
       
             
             if (i==vetA.length-1){
             JOptionPane.showMessageDialog(null, "A soma de todos os números do vetor A é: "+num);
               
         } }
       
       
         
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
  
    }
}
