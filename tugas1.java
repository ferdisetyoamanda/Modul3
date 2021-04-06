package modul3;
import java.util.Scanner;;
public class tugas1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] angka = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Ferdi", "Tesla"};
        int found = 0;
        System.out.println("Nama nama yang berpengaruh:\n");
        for (int i=0; i<angka.length; i++) {
            System.out.print("|"+angka[i]+"|");
        }
        
        System.out.println("\n\nmasukan nama yang akan dicari: ");
        String key = input.nextLine();
        
        for (int i=0; i<angka.length; i++) {
            if (key.equalsIgnoreCase(angka[i])){
            found = 1;
            System.out.println("Nama :"+key+", pada indeks ke -"+ i);
            break;
            }
        }
        if (found == 1) {
            System.out.println("Data telah ditemukan");
        }
        else{
            System.out.println("Data tidak ada");
            
        }
       
    }
    
}
