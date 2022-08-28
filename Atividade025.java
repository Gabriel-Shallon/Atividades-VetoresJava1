import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade025 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){ 
            
         int [] vetA = new int[10];
         
         int [] vetB = new int[vetA.length];
         
         
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
         
        for (int i = 0; i < vetA.length; i++){

            if ((vetA[i]%2)==0){

                vetB[i] = 1;

            }else{

                vetB[i] = 0;

            }

        }
         
        JOptionPane.showMessageDialog(null, "VETOR A\n\n\n"+vetA[0]+"\n"+vetA[1]+"\n"+vetA[2]+"\n"+vetA[3]+"\n"+vetA[4]+"\n"+vetA[5]+"\n"+vetA[6]+"\n"+vetA[7]+"\n"+vetA[8]+"\n"+vetA[9]+"\n\n\nVETOR B\n\n\n"+vetB[0]+"\n"+vetB[1]+"\n"+vetB[2]+"\n"+vetB[3]+"\n"+vetB[4]+"\n"+vetB[5]+"\n"+vetB[6]+"\n"+vetB[7]+"\n"+vetB[8]+"\n"+vetB[9]);

         
         
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          
        }
      }
  }
  
