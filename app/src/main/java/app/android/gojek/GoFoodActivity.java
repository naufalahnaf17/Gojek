package app.android.gojek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoFoodActivity extends AppCompatActivity {

    EditText eNama , eAlamat , ePesanan;
    Button btnPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_food);

        eNama = (EditText) findViewById(R.id.eNama);
        eAlamat = (EditText) findViewById(R.id.eAlamat);
        ePesanan = (EditText) findViewById(R.id.ePesanan);
        btnPesan = (Button) findViewById(R.id.btnPesan);

        btnPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = eNama.getText().toString().trim();
                String alamat = eAlamat.getText().toString().trim();
                String pesanan = ePesanan.getText().toString().trim();

                if (nama.isEmpty()){
                    eNama.setError("Nama Anda Tidak Boleh Kosong");
                    eNama.requestFocus();
                    return;
                }

                if (alamat.isEmpty()){
                    eAlamat.setError("Alamat Anda Tidak Boleh Kosong");
                    eAlamat.requestFocus();
                    return;
                }

                if (pesanan.isEmpty()){
                    ePesanan.setError("Pesanan Anda Tidak Boleh Kosong");
                    ePesanan.requestFocus();
                    return;
                }

                Intent intent = new Intent(GoFoodActivity.this , GoFoodPesanan.class);
                intent.putExtra("nama" , nama);
                intent.putExtra("alamat" , alamat);
                intent.putExtra("pesanan" , pesanan);
                startActivity(intent);
            }
        });

    }
}
