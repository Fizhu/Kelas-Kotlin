public class main {



    public static void main(String[] args) {
        System.out.println( kali(5,5));
    }

    public static int kali(int j, int k) {
        int hasil = 0;
        while (j > 0) {
            hasil += k;
            j--;
        }
        return hasil;
    }
}
