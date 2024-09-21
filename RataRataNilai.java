import java.util.Scanner;
public class RataRataNilai {
    public static void main(String[] args) {

        int jumlahSiswa;
        double totalNilai = 0; 
        double rataRata;
        double nilai;   

        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa : ");
        jumlahSiswa = s.nextInt();

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-" + i + ": ");
            nilai = s.nextDouble();
            totalNilai += nilai;
        }
        rataRata = totalNilai / jumlahSiswa;

        System.out.println("Rata-rata nilai dari " + jumlahSiswa +" siswa adalah = " +rataRata);
    
        s.close();
    }
    
}
