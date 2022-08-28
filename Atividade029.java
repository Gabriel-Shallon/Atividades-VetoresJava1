import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade029 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){ 
            
               int [] vetA = new int[10];
         
         int [] vetB = new int[vetA.length];
         
         int [] vetC = new int[vetA.length*2];

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
         

    
    for ( int i = 0; i < vetA.length; i++){

       vetC[i] = vetA[i];

    }

    int o = 0;
    for (int i = 0; i < vetB.length; i++){

         o = i+10;
        vetC[o] = vetB[i];

    }


         JOptionPane.showMessageDialog(null, "VETOR A\n\n"+vetA[0]+"\n"+vetA[1]+"\n"+vetA[2]+"\n"+vetA[3]+"\n"+vetA[4]+"\n"+vetA[5]+"\n"+vetA[6]+"\n"+vetA[7]+"\n"+vetA[8]+"\n"+vetA[9]+"\n\nVETOR B\n\n"+vetB[0]+"\n"+vetB[1]+"\n"+vetB[2]+"\n"+vetB[3]+"\n"+vetB[4]+"\n"+vetB[5]+"\n"+vetB[6]+"\n"+vetB[7]+"\n"+vetB[8]+"\n"+vetB[9]+"\n\nVETOR C\n\n"+vetC[0]+"          "+vetC[10]+"\n"+vetC[1]+"          "+vetC[11]+"\n"+vetC[2]+"          "+vetC[12]+"\n"+vetC[3]+"          "+vetC[13]+"\n"+vetC[4]+"          "+vetC[14]+"\n"+vetC[5]+"          "+vetC[15]+"\n"+vetC[6]+"          "+vetC[16]+"\n"+vetC[7]+"          "+vetC[17]+"\n"+vetC[8]+"          "+vetC[18]+"\n"+vetC[9]+"          "+vetC[19]);
       
         
         
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          
        }
  
    }
}


