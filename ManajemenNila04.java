import java.util.Scanner;
public class ManajemenNila04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0, jmlNilai = 0, totalNilai = 0, atasRata = 0;

        System.out.print("Jumlah siswa: ");
        jml = sc.nextInt();

       while (i < jml) {
        i++;
        System.out.println("Masukkan nilai siswa ke-" + (i) + ": ");
        nilai = sc.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid. Program selesai.");
        }

        totalNilai += nilai; 
            jmlNilai++;     

       }
       if (jmlNilai > 0) {
        double rataRata = (double) totalNilai / jmlNilai;
        System.out.println("Rata-rata nilai: " + rataRata);

        for (int j = 0; j < jml; j++) {
            if (nilaiSiswa > rataRata) {
                atasRata++;
            }
        }
        System.out.println("Jumlah siswa dengan nilai di atas rata-rata: " + atasRata);

        if (atasRata > jml / 2) {
            System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
        } else {
            System.out.println("Mayoritas siswa tidak memiliki nilai di atas rata-rata.");
        }
    } else {
        System.out.println("Tidak ada nilai yang dimasukkan.");
    }

    sc.close();
      
        }
    }

        