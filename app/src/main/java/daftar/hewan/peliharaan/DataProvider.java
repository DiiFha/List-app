package daftar.hewan.peliharaan;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import daftar.hewan.peliharaan.model.Anjing;
import daftar.hewan.peliharaan.model.Hewan;
import daftar.hewan.peliharaan.model.Kucing;
import daftar.hewan.peliharaan.model.Ikan;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> iniDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> iniDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Ikan> iniDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan("Cupang", "Indonesia",
                "Ikan Cupang adalah ikan yang berasal dari jenis ikan berukuran kecil dengan ukuran sekitar 2,5 cm dan dapat tumbuh hingga 12,5 cm.", R.drawable.fish_cupang));
        ikans.add(new Ikan("Guppy", "Amerika Utara",
                "Ikan Guppy adalah ikan yang mudah beradaptasi di berbagai lingkungan. Hal inilah yang membuat ikan Guppy bisa tersebar luas hingga ke seluruh dunia.", R.drawable.fish_guppy));
        ikans.add(new Ikan("Koi", "Jepang",
                "Jenis ikan hias ini sangat populer di kalangan pecinta ikan hias akuarium. Namun, biasanya orang memelihara ikan koi ini di dalam kolam.", R.drawable.fish_koi));
        ikans.add(new Ikan("Mas Koki", "Jepang ",
                "Ikan Mas Koki merupakan salah satu jenis ikan hias yang populer dikalangan pecinta ikan hias. Ikan ini memiliki karakteristik perut buncit dan warna yang cerah dan cantik yang membuat banyak orang menyukainya.", R.drawable.fish_mas));
        ikans.add(new Ikan("Molly", "Jepang ",
                "Ikan Molly sering juga disebut dengan ikan balon karena kebanyakan ikan molly memiliki perut yang buncit dan tubuh yang bundar.", R.drawable.fish_molly));
        ikans.add(new Ikan("Platy", "Meksiko",
                "Ikan Platy memiliki bentuk tubuh yang mungil dan memiliki banyak sekali jenisnya. Ukurannya yang kecil dan sifatnya yang 'cinta damai', membuat banyak orang memilih ikan ini menjadi pilihan untuk dipelihara di akuarium.", R.drawable.fish_platy));
        return ikans;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(iniDataKucing(ctx));
        hewans.addAll(iniDataAnjing(ctx));
        hewans.addAll(iniDataIkan(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
