/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbop1;
import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 *
 * @author HP
 */
public class segitigaNIM {
    public static void main(String[] args) {
        try (Formatter file = new Formatter("C:\\Users\\HP\\Documents\\NetBeansProjects\\pboP1\\src\\pbop1\\nim.txt")){
    int [] nim = {2, 1, 4 , 1, 7, 6, 2, 1, 4, 8};
      int count =0;
      
      int i = 1;
      do{
	int j = 4 ;
	do{
            System.out.print(" ");
            file.format("%s" ," ");

            j--;
		}while(j>=i);
                    int k = 1 ;
                    do{
                    System.out.print(nim[count]+" ");
                    file.format("%s" , nim[count]+" ");
                    count++;
                    k++;
                        }while(k<= i);
                        i++;
			System.out.println();
                        file.format("%s %n", "");
		}while(i<=4);
      int jml = 0;
        for(int a : nim){
            jml = a + jml;
        }
        System.out.println("Jumlah keseluruhan NIM : " +jml);
	file.format("%s %n", "Jumlah keseluruhan NIM : " +jml);
        
        }catch(FileNotFoundException ex){
            //Menampilkan pesan jika file tidak ditemukan
            System.out.println("File Tidak Ditemukan");
        }
    }
}

        

