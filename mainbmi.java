public class mainbmi {

    public static void mainbmi(String[] args) {
        // Data uji
        double beratUdin1 = 78.0;
        double tinggiUdin1 = 1.69;
        double beratNanang1 = 92.0;
        double tinggiNanang1 = 1.95;

        double beratUdin2 = 95.0;
        double tinggiUdin2 = 1.88;
        double beratNanang2 = 85.0;
        double tinggiNanang2 = 1.76;

        // Menghitung BMI
        double bmiUdin1 = beratUdin1 / (tinggiUdin1 * tinggiUdin1);
        double bmiNanang1 = beratNanang1 / (tinggiNanang1 * tinggiNanang1);

        double bmiUdin2 = beratUdin2 / (tinggiUdin2 * tinggiUdin2);
        double bmiNanang2 = beratNanang2 / (tinggiNanang2 * tinggiNanang2);

        // Membandingkan BMI
        boolean udinLebihTinggi1 = bmiUdin1 > bmiNanang1;
        boolean udinLebihTinggi2 = bmiUdin2 > bmiNanang2;

        // Menampilkan hasil
        System.out.println("Data 1:");
        System.out.println("BMI Udin (" + bmiUdin1 + ") " + (udinLebihTinggi1 ? "lebih tinggi" : "tidak lebih tinggi")
                + " dari Nanang (" + bmiNanang1 + ")");

        System.out.println("\nData 2:");
        System.out.println("BMI Udin (" + bmiUdin2 + ") " + (udinLebihTinggi2 ? "lebih tinggi" : "tidak lebih tinggi")
                + " dari Nanang (" + bmiNanang2 + ")");
    }
}
