package app.android.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GoFoodPesanan extends AppCompatActivity {

    TextView txtNama , txtAlamat , txtPesanan;
    Button btnVerif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food_pesanan);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtAlamat = (TextView) findViewById(R.id.txtAlamat);
        txtPesanan = (TextView) findViewById(R.id.txtPesanan);
        btnVerif = (Button) findViewById(R.id.verifikasi);
        btnVerif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GoFoodPesanan.this , MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        String nama = getIntent().getStringExtra("nama");
        String alamat = getIntent().getStringExtra("alamat");
        String pesanan = getIntent().getStringExtra("pesanan");

        txtNama.setText(nama);
        txtAlamat.setText(alamat);
        txtPesanan.setText(pesanan);
    }
}
