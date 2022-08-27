import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade016 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[10];
  
         
         for (int i = 0; i < vetA.length; i++){
         
         vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com os elementos do vetor A na posição ["+(i+1)+"]."));
         
         
         
         }
          double somamenor15 =0;
         for (int i = 0; i < vetA.length; i++){
         
         if (vetA[i]<15){
        
            somamenor15+=vetA[i];
            
         } }
         
           int igual15 =0;
         for (int i = 0; i < vetA.length; i++){
         
         if (vetA[i]==15){
        
           igual15++;
            
         } }
         
         double maior15 =0;
         double somamaior15 = 0;
         for (int i = 0; i < vetA.length; i++){
         
         if (vetA[i]>15){
        
           maior15++;
           somamaior15+=vetA[i];
            
         } }
         
        
         double mediamaior15 = somamaior15/maior15;
         
         
         JOptionPane.showMessageDialog(null, "Soma dos números menores que 15= "+somamenor15+"\nNúmeros iguais a 15= "+igual15+"\nMédia dos números maiores que 15= "+mediamaior15);
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
  
    }
}
