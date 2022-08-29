import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Atividade020e21 {
    
    public static void main(String[] args){

               
                
        int A = 0; 
        
        while (A!=1){      
              double [] vetA= new double[20];
              
        
            double cotacao = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe quantos reais um dolar está valendo no momento."));
             
        
              for (int i=0; i < vetA.length; i++) {
                vetA[i] = cotacao * (i+1);
              }
        
             
              
              for (int i = 0; i < vetA.length; i++) {
                JOptionPane.showMessageDialog(null, (i+1)+" Dolars  vale: "+vetA[i]+" reais.");
              } 
              
              

              UIManager.put("OptionPane.yesButtonText","Sim");
              UIManager.put("OptionPane.noButtonText","Não");
              
              
                A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
                
            }
        }
    }   