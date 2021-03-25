package JavaLibs5026201114;

import javax.swing.JOptionPane;

public class JavaLibs5026201114 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,
                "Halo Beauties, Selamat datang di YourSkinCare! Kami akan membantu kamu memilih skincare yang tepat, tetapi sebelumnya jawab pertanyaan dulu yuk, udah siap?",
                "Welcome Beauties",
                1);

        String nama = (String)JOptionPane.showInputDialog(null,
                "Nama kamu siapa nih?",
                "Question 1",
                3,
                null,
                null,
                "Namaku...");

        int umur = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Sekarang kamu umur berapa?",
                "Question 2",
                3));

        String[] acceptableValues = {"Normal", "Kering", "Berminyak", "Sensitif", "Konbinasi"};
        String tipekulit = (String)JOptionPane.showInputDialog(null,
                "Tipe kulit kamu apa?",
                "Question 3",
                1,
                null,
                acceptableValues,
                acceptableValues[1]);

        String[] acceptableValues1 = {"Jerawat", "Kemerahan", "Keriput", "Bintik hitam"};
        String masalahkulit = (String)JOptionPane.showInputDialog(null,
                "Apa masalah kulit yang sedang kamu hadapi?",
                "Question 4",
                1,
                null,
                acceptableValues1,
                acceptableValues[1]);

        int cucimuka = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Berapa kali kamu mencuci muka dalam sehari? ___ kali.",
                "Question 5",
                3));

        int budget = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Budget skincare kamu untuk sebulan kira-kira berapa? Sekitar ______ Rupiah",
                "Qustion 6",
                3));

        int diskon = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Coba sekarang kamu pilih satu bilangan dari 10 sampai 50.",
                "Question 7",
                2));

        int potongandiskon = budget * (diskon) / 100;
        double gratisongkir= Double.parseDouble(JOptionPane.showInputDialog("Satu pertanyaan lagi nih, dari angka 1 sampai 3, kamu pilih yang mana?"));

        JOptionPane.showMessageDialog(null, "Halo " +nama+ "! Selamat datang di YourSkinCare. Berdasarkan jawaban yang telah kamu berikan," +
                "\nkami merekomendasikan skincare yang cocok untuk kamu yang berumur " + umur + " tahun, dengan tipe \nkulit " + tipekulit +
                " serta permasalahan kulit " + masalahkulit + ", yaitu skincare yang memiliki bahan utama \nHyaluronic Acid. Kamu bisa menggunakan sabun muka yang " +
                "berbahan Hyaluronic Acid dan mencuci \nmuka sebanyak " + cucimuka + " kali dalam sehari. Sebagai member baru kamu berhak mendapatkan diskon " +
                "\n" + diskon + "% dari budget skincare kamu " + budget + ", yaitu sebesar " + potongandiskon + " untuk pembelian \npertama. Oiya gak hanya itu, kamu juga mendapatkan gratis ongkir " +
                "sebanyak " + gratisongkir + " kali.\nHappy Shopping Beauties!");

        System.out.println ("Halo " +nama+ "! Selamat datang di YourSkinCare. Berdasarkan jawaban yang telah kamu berikan," +
                "\nkami merekomendasikan skincare yang cocok untuk kamu yang berumur " + umur + " tahun, dengan tipe \nkulit " + tipekulit +
                " serta permasalahan kulit " + masalahkulit + ", yaitu skincare yang memiliki bahan utama \nHyaluronic Acid. Kamu bisa menggunakan sabun muka yang " +
                "berbahan Hyaluronic Acid dan mencuci \nmuka sebanyak " + cucimuka + " kali dalam sehari. Sebagai member baru kamu berhak mendapatkan diskon " +
                "\n" + diskon + "% dari budget skincare kamu " + budget + ", yaitu sebesar " + potongandiskon + " untuk pembelian \npertama. Oiya gak hanya itu, kamu juga mendapatkan gratis ongkir " +
                "sebanyak " + gratisongkir + " kali.\nHappy Shopping Beauties!");
        
    }
}