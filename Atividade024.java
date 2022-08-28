import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade024 {
    
    

    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[10];
                int [] vetB = new int[5];
         
         for (int i = 0; i < vetA.length; i++){
         
         vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor A na posição ["+(i+1)+"]."));
         
         }

         for (int i = 0; i < vetA.length;i++){

            if (i > 4){
            vetB[i-5] = vetA[i];
            }
         }


         int C = 0;
         int o = 5;
         for ( int i = 0; i < (vetA.length)/2; i++){

            o--;
            
            if (vetA[i]!=vetB[o]){

                C+=1;

            }

         }
        
         if (C > 0){

            JOptionPane.showMessageDialog(null, vetA[0]+"\n"+vetA[1]+"\n"+vetA[2]+"\n"+vetA[3]+"\n"+vetA[4]+"\n"+vetA[5]+"\n"+vetA[6]+"\n"+vetA[7]+"\n"+vetA[8]+"\n"+vetA[9]+"\n\nOs números do vetor não formam um palíndromo.");

         }
         if (C == 0){

            JOptionPane.showMessageDialog(null, vetA[0]+"\n"+vetA[1]+"\n"+vetA[2]+"\n"+vetA[3]+"\n"+vetA[4]+"\n"+vetA[5]+"\n"+vetA[6]+"\n"+vetA[7]+"\n"+vetA[8]+"\n"+vetA[9]+"\n\nOs números do vetor formam um palíndromo.");

         }
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
        }
      }
  