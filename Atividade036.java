import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade036 {
    
    public static void main(String[] args){


        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[11];
                

   
                for (int i = 0; i < vetA.length; i++){


                  vetA[i] = (int) Math.pow(2, i);
        
        
                }


        for (int i = 0; i <vetA.length; i++){

            JOptionPane.showMessageDialog(null, "VetorA["+(i+1)+"]: "+vetA[i]);

        }



 
       

         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          
        }
    }
}

    
