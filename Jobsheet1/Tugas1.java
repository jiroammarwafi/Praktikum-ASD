import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        char [] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' '},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' '},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' '},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' '},
            {'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' '},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' '},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' '},
            {'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' '},
            {'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };
        int i = 5;
        while (i>0) {
            System.out.print("Input Kode: ");
            String kode = in.next();
            System.out.print("Nama Kota: ");
            for (int x = 0; x < KODE.length; x++){
                if (kode.charAt(0) == KODE[x]){
                    for (int y = 0; y < 12; y++){
                        System.out.print(KOTA[x][y]);
                    }
                }
            }
            System.out.println("\n");
            i--;
        }
    }}
