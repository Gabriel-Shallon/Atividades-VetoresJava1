

import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Atividade037 {
    


    public static void main(String[] args){


        int A = 0; 
        
        while (A!=1){    
            
            
                int[] vetA = new int[15];
                long[] vetB = new long[vetA.length];
            
    
             for (int i = 0; i < vetA.length; i++){
             
             vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor A na posição ["+(i+1)+"]."));
            
             }
           

          

             for (int i = 0; i < vetA.length; i++) {
                
                vetB[i] = 1;

             }


             for (int j = 0; j < vetA.length; j++){

                for (int i = 1; i <= vetA[j]; i++){

                    vetB[j] = vetB[j]*i;
                    

                }

             }




            for (int i = 0; i < vetA.length; i++){

            JOptionPane.showMessageDialog(null, "Fatorial de VetorA["+(i+1)+"]("+vetA[i]+"): "+vetB[i]);

           }

        }
       

         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          
        }
    }


