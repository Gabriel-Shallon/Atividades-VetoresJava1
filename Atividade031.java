import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade031 {
    
    public static void main(String[] args){


        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[20];
  

         UIManager.put("OptionPane.yesButtonText","Números aleatórios");
         UIManager.put("OptionPane.noButtonText","Números selecionados");
         
                int b = JOptionPane.showConfirmDialog(null, "Deseja gerar números aleatórios (de 0 a 100) para o vetor A ou seleciona-los?", "Escolher.Vetor", JOptionPane.YES_NO_OPTION);
         
                if (b == 0){
    
                    for (int i = 0; i < vetA.length; i++){
    
                    vetA[i] = (int)Math.round(Math.random() * 100); 
    
                    }
                }
    
             if (b == 1){
    
             for (int i = 0; i < vetA.length; i++){
             
             vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor A na posição ["+(i+1)+"]."));
            
             }
            }


         
         int [] vetB = new int[20];
        

         int o = 0;
         int u = 0;
         for (int i = 0; i < vetB.length; i++){
     
             if ((vetA[i]%2)==1){
                 
                o++;
            vetB[o+4] = vetA[i];

             }   
        }
     
         for (int i = 0; i < vetA.length; i++){

             if ((vetA[i]%2)==0){
                
                u++;
            vetB[u-1] = vetA[i];

           }   
        } 
         


         for (int i = 0; i < vetA.length; i++){


            JOptionPane.showMessageDialog(null, "Vetor A posição ["+(i+1)+"]: "+vetA[i]);


         }


         for (int i = 0; i < vetB.length; i++){


            JOptionPane.showMessageDialog(null, "Vetor B posição ["+(i+1)+"](números pares do vetor A): "+vetB[i]);


         }

         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
        }
    }
