/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbop1;

/**
 *
 * @author HP
 */
public class segitigaNIM {
    public static void main(String[] args) {
    int [] nim = {2, 1, 4 , 1, 7, 6, 2, 1, 4, 8};
      int count =0;
      
      int i = 1;
      do{
	int j = 4 ;
	do{
            System.out.print(" ");
            j--;
		}while(j>=i);
                    int k = 1 ;
                    do{
                    System.out.print(nim[count]+" ");
                    count++;
                    k++;
                        }while(k<= i);
                        i++;
			System.out.println();
		}while(i<=4);
      int jml = 0;
        for(int a : nim){
            jml = a + jml;
        }
        System.out.println("Jumlah keseluruhan NIM : " +jml);
	}
    }
  
        

