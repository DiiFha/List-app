package daftar.hewan.peliharaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnKucing,btnAnjing,btnIkan;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnIkan = findViewById(R.id.btn_buka_ras_ikan);
        btnIkan.setOnClickListener(view -> bukaGaleri("Ikan"));
        btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
    }
    public void btn_profil(View View) {
        Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);
        startActivity(intent);
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}