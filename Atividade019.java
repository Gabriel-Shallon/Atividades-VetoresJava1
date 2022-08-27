import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade019 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[10];
                int [] vetB = new int[10];
                int [] vetC = new int[10];
           
  
         
         for (int i = 0; i < vetA.length; i++){
         
         vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a 1° nota do aluno "+(i+1)+"."));
         
         }
         
          for (int i = 0; i < vetB.length; i++){
         
         vetB[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com a 2° nota do aluno "+(i+1)+"."));
         
         }
         
         
               
      for (int i = 0; i < vetA.length; i++) {
      
       vetC[i] = (vetA[i]+vetB[i])/2;
          
      } 
           
         for (int i = 0; i < vetA.length; i++){
         
             if (vetC[i]>=6){
         JOptionPane.showMessageDialog(null, "(Aluno"+(i+1)+")Nota: "+vetC[i]+"\nAPROVADO");
         
         } if (vetC[i]<6){
         JOptionPane.showMessageDialog(null, "(Aluno"+(i+1)+")Nota: "+vetC[i]+"\nREPROVADO");
         
         }}
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
  
    }
}
