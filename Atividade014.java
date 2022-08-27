import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade014 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){ 
                int [] vetA = new int[3];
         
         
         
         for (int i = 0; i < vetA.length; i++){
         
         vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor A na posição ["+(i+1)+"]."));
         
         
         
         }
         double media = 0;
        int soma = 0;
       
         int impares = 0;
         for (int i = 0; i < vetA.length; i++){
     
             if ((vetA[i]%2)==1){
         impares++;
         soma+=vetA[i];
             }   
         }
         media = soma/impares;
         JOptionPane.showMessageDialog(null, media);
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
  
    }
}
