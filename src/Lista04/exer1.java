
package Lista04;

import javax.swing.JOptionPane;


public class exer1 {
    
   public static void main(String[] args){
       
      int vet[] = new int[10];
      int i;
      double soma =0;
      double media =0;
      
      int maior = 0;
      int maior2 = 0;
      int maior3 = 0;
      int maior4 = 0;
      int maior5 = 0;
      int maior6 = 0;
      int maior7 = 0;
      int maior8 = 0;
      int maior9 = 0;
      
      
      JOptionPane.showMessageDialog(null,"Numeros maiores que a media digitada entre com 10 valores ! ");
      for (i=0;i<10;i++){
          
          String A = JOptionPane.showInputDialog(null,"Digite o numero "+(i+1)+":");
         vet[i] = Integer.parseInt(A);
         
         if(vet[i]>maior)
             maior=vet[i];
         
                
            soma = soma + vet[i]; 
         
          media = soma/10;  
         
      }
      
      for (i=0;i<10;i++){
          
       if ((vet[i]>maior2) && (vet[i] != maior))
                     maior2=vet[i];   
      }
      
      for (i=0;i<10;i++){
          
       if ((vet[i]>maior3) && (vet[i] != maior) && (vet[i] != maior2))
                     maior3=vet[i];   
      }
      
      for (i=0;i<10;i++){
          
       if ((vet[i]>maior4) && (vet[i] != maior) && (vet[i] != maior2) && (vet[i] != maior3) )
                     maior4=vet[i];   
      }
      
      for (i=0;i<10;i++){
          
       if ((vet[i]>maior5) && (vet[i] != maior) && (vet[i] != maior2) && (vet[i] != maior3) && (vet[i] != maior4) )
                     maior5=vet[i];   
      }
      
      for (i=0;i<10;i++){
          
       if ((vet[i]>maior6) && (vet[i] != maior) && (vet[i] != maior2) && (vet[i] != maior3) && (vet[i] != maior4) && (vet[i] != maior5) )
                     maior6=vet[i];   
      }
      
      for (i=0;i<10;i++){
          
       if ((vet[i]>maior7) && (vet[i] != maior) && (vet[i] != maior2) && (vet[i] != maior3) && (vet[i] != maior4) && (vet[i] != maior5) && (vet[i] != maior6) )
                     maior7=vet[i];   
      }
      
      for (i=0;i<10;i++){
          
       if ((vet[i]>maior8) && (vet[i] != maior) && (vet[i] != maior2) && (vet[i] != maior3) && (vet[i] != maior4) && (vet[i] != maior5) && (vet[i] != maior6) && (vet[i] != maior7) )
                     maior8=vet[i];   
      }
      
      for (i=0;i<10;i++){
          
       if ((vet[i]>maior9) && (vet[i] != maior) && (vet[i] != maior2) && (vet[i] != maior3) && (vet[i] != maior4) && (vet[i] != maior5) && (vet[i] != maior6) && (vet[i] != maior7) && (vet[i] != maior8))
                     maior9=vet[i];   
      }
      
      
      
      
      
      
      if ((media<maior ) && (media<maior2) && (media<maior3) && (media<maior4) && (media<maior5)&& (media<maior6 ) && (media<maior7) && (media<maior8) && (media<maior9) ) {
         
           JOptionPane.showMessageDialog(null,"\n A Média: "+media+"\n Numeros maiores que a media são : "+maior+","+maior2+","+maior3+","+maior4+","+maior5+","+maior6+","+maior7+","+maior8+","+maior9);   
             
         }
      else {
          if ((media<maior ) && (media<maior2) && (media<maior3) && (media<maior4) && (media<maior5)&& (media<maior6 ) && (media<maior7) && (media<maior8))
            JOptionPane.showMessageDialog(null,"\n A Média: "+media+"\n Numeros maiores que a media são : "+maior+","+maior2+","+maior3+","+maior4+","+maior5+","+maior6+","+maior7+","+maior8); 
      
      
     else {
              if((media<maior ) && (media<maior2) && (media<maior3) && (media<maior4) && (media<maior5)&& (media<maior6 ) && (media<maior7))
            JOptionPane.showMessageDialog(null,"\n A Média: "+media+"\n Numeros maiores que a media são : "+maior+","+maior2+","+maior3+","+maior4+","+maior5+","+maior6+","+maior7); 
              
              
              else {
              if((media<maior ) && (media<maior2) && (media<maior3) && (media<maior4) && (media<maior5)&& (media<maior6 ))
            JOptionPane.showMessageDialog(null,"\n A Média: "+media+"\n Numeros maiores que a media são : "+maior+","+maior2+","+maior3+","+maior4+","+maior5+","+maior6); 
              
              else {
              if((media<maior ) && (media<maior2) && (media<maior3) && (media<maior4) && (media<maior5))
            JOptionPane.showMessageDialog(null,"\n A Média: "+media+"\n Numeros maiores que a media são : "+maior+","+maior2+","+maior3+","+maior4+","+maior5); 
              
              else {
              if((media<maior ) && (media<maior2) && (media<maior3) && (media<maior4))
            JOptionPane.showMessageDialog(null,"\n A Média: "+media+"\n Numeros maiores que a media são : "+maior+","+maior2+","+maior3+","+maior4); 
                
              else {
              if((media<maior ) && (media<maior2) && (media<maior3))
            JOptionPane.showMessageDialog(null,"\n A Média: "+media+"\n Numeros maiores que a media são : "+maior+","+maior2+","+maior3); 
              
              else {
              if((media<maior ) && (media<maior2))
            JOptionPane.showMessageDialog(null,"\n A Média: "+media+"\n Numeros maiores que a media são : "+maior+","+maior2); 
              
              
              else {
              if(media<maior ) 
            JOptionPane.showMessageDialog(null,"\n A Média: "+media+"\n Numeros maiores que a media são : "+maior); 
              
              else {
        JOptionPane.showMessageDialog(null,"Erro a media é maior que os numeros digitados! media: "+media);
                                }
              
              
                             }
                          }
                       }
                    } 
                 }
              }
           }
        }
       
   } 
    
    
}
