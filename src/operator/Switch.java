package operator;

public class Switch {
    public static void main(String[] args){
        char nilai='A';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   :\"Terimakasih pak\"");
                System.out.println("Dosen :\"Selamat ya!!\"");
                break;
            case 'B':
                System.out.println("Mhs   :\"kenapa ulun kada dapat A, pak?\"");
                System.out.println("dosen :\"#$%@\"");
                break;
            case 'C':
                System.out.println("Mhs   :\"Ulun turun pul pak ai, tugas ngumpul jua\"");
                System.out.println("dosen :\"Tapi bisalah menjawab ujian\"");
                System.out.println("Mhs   :\"wkwkwkw... kada pa ai\"");
                break;
            default:
                System.out.println("Mhs   :\"Ulun turun pul pak ai, tugas ngumpul jua\"");
                System.out.println("Dosem :\"Bujur juakah\"");
                System.out.println("Dosen :\"memeriksa berkasas\"");
                System.out.println("Dosen :\"menceleng\"");
                System.out.println("Mhs   :\"Kabur..\"");
                break;
        }

    }
}
