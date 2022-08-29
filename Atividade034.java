import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade034 {
    
    public static void main(String[] args){



        
        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[10];
                

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

             
                for (int j = 0; j < vetA.length; j++){

                    JOptionPane.showMessageDialog(null, "Números pares entre 2 a VetorA["+(j+1)+"]("+vetA[j]+"):");

                   
   
                       if ( vetA[j] % 2 == 0){
                        int par = 0;
                        int par2 = 0;
                           for (int o = 1; o < vetA[j]/2; o++){

                            par+=2;
                            par2 = vetA[j]-par;
                            JOptionPane.showMessageDialog(null, par2);

                           }
                          
                        }else{
                                vetA[j]-=1;
                                int par = 0;
                                int par2 = 0;
                                   for (int o = 1; o < vetA[j]/2; o++){
        
                                    par+=2;
                                    par2 = vetA[j]-par;
                                    JOptionPane.showMessageDialog(null, par2);
        
                                   }

                        }
                    }
                

    


         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          
        }
    }
}
