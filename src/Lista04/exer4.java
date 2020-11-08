
package Lista04;

import javax.swing.JOptionPane;


public class exer4 {
    
     public static void main(String[] args){
         
         int i;
         double n,n2,n3,media = 0,media1 = 0,media2 = 0,mediafinal = 0;
         
         
         
         JOptionPane.showMessageDialog(null,"Media de cada classe e media da escola  "); 
       for(i = 0;i<5;i++){
       String A = JOptionPane.showInputDialog(null,"\n CLASSE 1 \n "+"Digite a nota do aluno "+(i+1)+" :");  
       n = Double.parseDouble(A);
       
       media +=n; 
       
       }
       media = media/5;
       
       
       for(i = 0;i<5;i++){
       String B = JOptionPane.showInputDialog(null,"\n CLASSE 2 \n "+"Digite a nota do aluno "+(i+1)+" :");  
       n2 = Double.parseDouble(B);
       
       media1 +=n2;
     }
       media1 = media1/5;
       
       
     for(i = 0;i<5;i++){
       String C = JOptionPane.showInputDialog(null,"\n CLASSE 3 \n "+"Digite a nota do aluno "+(i+1)+" :");  
       n3 = Double.parseDouble(C);
       
       media2 +=n3;
     }
     media2 = media2/5;
     
     mediafinal = (media+media1+media2)/3;
     JOptionPane.showMessageDialog(null,"\n Media da CLASSE 1 é : "+media+"\n Media da CLASSE 2 é : "+media1+"\n Media da CLASSE 3 é : "+media2+"\n Media da ESCOLA é : "+mediafinal); 
     
     
     }
}
