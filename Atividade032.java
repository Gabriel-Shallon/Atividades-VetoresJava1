import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade032 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[5];
  

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


            JOptionPane.showMessageDialog(null, "VetorA["+(i+1)+"]\n\n\n"+vetA[i]+" x "+(1)+" = "+(vetA[i]*(1))+"\n"+vetA[i]+" x "+(2)+" = "+(vetA[i]*(2))+"\n"+vetA[i]+" x "+(3)+" = "+(vetA[i]*(3))+"\n"
            +vetA[i]+" x "+(4)+" = "+(vetA[i]*(4))+"\n"+vetA[i]+" x "+(5)+" = "+(vetA[i]*(5))+"\n"+vetA[i]+" x "+(6)+" = "+(vetA[i]*(6))+"\n"+vetA[i]+" x "+(7)+" = "+(vetA[i]*(7))+"\n"
            +vetA[i]+" x "+(8)+" = "+(vetA[i]*(8))+"\n"+vetA[i]+" x "+(9)+" = "+(vetA[i]*(9))+"\n"+vetA[i]+" x "+(10)+" = "+(vetA[i]*(10))+"\n");


         }
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
        }
}

