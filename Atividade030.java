import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade030 {
    
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
            
         int impares = 0;
         for (int i = 0; i < vetA.length; i++){
     JOptionPane.showMessageDialog(null, impares+"\n"+i);
             if ((vetA[i]%2)==1){
         impares++;
             }   
         }
         
          int pares = 0;
         for (int i = 0; i < vetA.length; i++){
     JOptionPane.showMessageDialog(null, pares+"\n"+i);
             if ((vetA[i]%2)==0){
         pares++;
             }   
         }
         
         int [] vetB = new int[pares+1];

         int [] vetC = new int[impares+1];

         int o = 0;
         int u = 0;
         for (int i = 0; i < vetA.length; i++){
     
             if ((vetA[i]%2)==1){
                 
                o++;
            vetC[o] = vetA[i];

             }   
     
             if ((vetA[i]%2)==0){
                
                u++;
            vetB[u] = vetA[i];
           }   
           JOptionPane.showMessageDialog(null, vetC[o]+"\n"+vetB[u]+"\n"+i); 
         }


         for (int i = 0; i < pares; i++){


            JOptionPane.showMessageDialog(null, "Vetor A:"+vetA[i]);


         }


         for (int i = 0; i < pares; i++){


            JOptionPane.showMessageDialog(null, "Vetor B(números pares do vetor A):"+vetB[i]);


         }

         for (int i = 0; i < impares; i++){


            JOptionPane.showMessageDialog(null, "Vetor C(números impares do vetor A):"+vetC[i]);


         }
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
        }
      }
  

