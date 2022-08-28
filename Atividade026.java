import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade026 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){ 
            
               int [] vetA = new int[10];
         
         int [] vetB = new int[vetA.length];
         
         int [] vetC = new int[vetA.length];

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
         
        int c = JOptionPane.showConfirmDialog(null, "Deseja gerar números aleatórios (de 0 a 100) para o vetor B ou seleciona-los?", "Escolher.Vetor", JOptionPane.YES_NO_OPTION);
         
        if (c == 0){

            for (int i = 0; i < vetA.length; i++){

            vetB[i] = (int)Math.round(Math.random() * 100); 

            }
        }

     if (c == 1){

     for (int i = 0; i < vetA.length; i++){
     
     vetB[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor B na posição ["+(i+1)+"]."));
    
     }
    }
         
      for (int i = 0; i < vetA.length; i++){

            if (vetA[i]>vetB[i]){
                vetC[i]=1;
            }if (vetA[i]==vetB[i]){
                vetC[i]=0;
            }if (vetA[i]<vetB[i]){
                vetC[i]=-1;
            }
      }

         JOptionPane.showMessageDialog(null, "VETOR A\n\n"+vetA[0]+"\n"+vetA[1]+"\n"+vetA[2]+"\n"+vetA[3]+"\n"+vetA[4]+"\n"+vetA[5]+"\n"+vetA[6]+"\n"+vetA[7]+"\n"+vetA[8]+"\n"+vetA[9]+"\n\nVETOR B\n\n"+vetB[0]+"\n"+vetB[1]+"\n"+vetB[2]+"\n"+vetB[3]+"\n"+vetB[4]+"\n"+vetB[5]+"\n"+vetB[6]+"\n"+vetB[7]+"\n"+vetB[8]+"\n"+vetB[9]+"\n\nVETOR C\n\n"+vetC[0]+"\n"+vetC[1]+"\n"+vetC[2]+"\n"+vetC[3]+"\n"+vetC[4]+"\n"+vetC[5]+"\n"+vetC[6]+"\n"+vetC[7]+"\n"+vetC[8]+"\n"+vetC[9]);
         
         
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          
        }
  
    }
}
