import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Atividade018 {
    
    public static void main(String[] args){

        int A = 0; 
        
        while (A!=1){            
                int [] vetA = new int[10];
           
  
         
         for (int i = 0; i < vetA.length; i++){
         
         vetA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com as idades no vetor A, na posição ["+(i+1)+"]."));
         
         
         
         }
         
         int maior = Integer.MIN_VALUE;
         int posicaomaior = 0;
               
      for (int i = 0; i < vetA.length; i++) {
      
            if (vetA[i] > maior) {
          
              maior = vetA[i];
              posicaomaior = i;
          
      }
  }
         int menor = Integer.MAX_VALUE;
         int posicaomenor = 0;
               
      for (int i = 0; i < vetA.length; i++) {
      
            if (vetA[i] < menor) {
          
              menor = vetA[i];
              posicaomenor = i;
          
      }
  }
        
          
           
         
         
         JOptionPane.showMessageDialog(null, "Maior idade: "+maior+" (vetorA["+posicaomaior+"])\nMenor idade: "+menor+" (vetorA["+posicaomenor+"])");
         
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        
        
          A = JOptionPane.showConfirmDialog(null, "Deseja executar novamente?","Reiniciar", JOptionPane.YES_NO_OPTION); 
          
          
          }
  
    }
}
