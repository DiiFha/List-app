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
        kucings.add(new Kucing(ctx.getString(R.string.angora_nama), ctx.getString(R.string.angora_asal),
                ctx.getString(R.string.angora_deskripsi), R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.bengal_nama), ctx.getString(R.string.bengal_asal),
                ctx.getString(R.string.bengal_deskripsi), R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.birmani_nama), ctx.getString(R.string.birmani_asal),
                ctx.getString(R.string.birmani_deskripsi), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.persia_nama), ctx.getString(R.string.persia_asal),
                ctx.getString(R.string.persia_deskripsi), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.siam_nama), ctx.getString(R.string.siam_asal),
                ctx.getString(R.string.siam_deskripsi), R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.siberian_nama), ctx.getString(R.string.siberian_asal),
                ctx.getString(R.string.siberian_deskripsi), R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> iniDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.bulldog_nama), ctx.getString(R.string.bulldog_asal),
                ctx.getString(R.string.bulldog_deskripsi), R.drawable.dog_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.husky_nama), ctx.getString(R.string.husky_asal),
                ctx.getString(R.string.husky_deskripsi), R.drawable.dog_husky));
        anjings.add(new Anjing(ctx.getString(R.string.kintamani_nama), ctx.getString(R.string.kintamani_asal),
                ctx.getString(R.string.kintamani_deskripsi), R.drawable.dog_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.samoyed_nama), ctx.getString(R.string.samoyed_asal),
                ctx.getString(R.string.samoyed_deskripsi), R.drawable.dog_samoyed));
        anjings.add(new Anjing(ctx.getString(R.string.shepherd_nama), ctx.getString(R.string.shepherd_asal),
                ctx.getString(R.string.shepherd_deskripsi), R.drawable.dog_shepherd));
        anjings.add(new Anjing(ctx.getString(R.string.shiba_nama), ctx.getString(R.string.shiba_asal),
                ctx.getString(R.string.shiba_deskripsi), R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Ikan> iniDataIkan(Context ctx) {
        List<Ikan> ikans = new ArrayList<>();
        ikans.add(new Ikan(ctx.getString(R.string.cupang_nama), ctx.getString(R.string.cupang_asal),
                ctx.getString(R.string.cupang_deskripsi), R.drawable.fish_cupang));
        ikans.add(new Ikan(ctx.getString(R.string.guppy_nama), ctx.getString(R.string.guppy_asal),
                ctx.getString(R.string.guppy_deskripsi), R.drawable.fish_guppy));
        ikans.add(new Ikan(ctx.getString(R.string.koi_nama), ctx.getString(R.string.koi_asal),
                ctx.getString(R.string.koi_deskripsi), R.drawable.fish_koi));
        ikans.add(new Ikan(ctx.getString(R.string.mas_nama), ctx.getString(R.string.mas_asal),
                ctx.getString(R.string.mas_deskripsi), R.drawable.fish_mas));
        ikans.add(new Ikan(ctx.getString(R.string.molly_nama), ctx.getString(R.string.molly_asal),
                ctx.getString(R.string.molly_deskripsi), R.drawable.fish_molly));
        ikans.add(new Ikan(ctx.getString(R.string.platy_nama), ctx.getString(R.string.platy_asal),
                ctx.getString(R.string.platy_deskripsi), R.drawable.fish_platy));
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
