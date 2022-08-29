import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade033 {
    
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



                 for (int i = 0; i < vetB.length; i++){

                    vetB[i] = 0;

                 }

                 for (int j = 0; j < vetA.length; j++){

                 for (int i = 2; i < vetA[j]/2; i++){

                
                    if ((vetA[j])%i==0){

                       
                        vetB[j] = 1;
                       

                    }
                 }
                 if (vetB[j] > 0){

                    JOptionPane.showMessageDialog(null, "VetorA["+(j+1)+"]: "+vetA[j]+"\n\nNÃO É PRIMO.");

                }else if((vetB[j]==0)&&(vetA[j]!=1)){

                JOptionPane.showMessageDialog(null, "VetorA["+(j+1)+"]: "+vetA[j]+"\n\nÉ PRIMO.");

                }else{

                    JOptionPane.showMessageDialog(null, "VetorA["+(j+1)+"]: "+vetA[j]+"\n\nNÃO É PRIMO.");

                }
             }

       

         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          
        }
    }
}

