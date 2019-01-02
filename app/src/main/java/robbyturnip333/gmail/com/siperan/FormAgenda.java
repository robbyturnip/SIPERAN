package robbyturnip333.gmail.com.siperan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.Date;

public class FormAgenda extends AppCompatActivity {
   android.support.v7.widget.Toolbar toolbar;
   Button simpan;
   EditText acara,nim,nama,judul;
   Spinner narasumber1,narasumber2,narasumber3;
   TextView waktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_agenda);
        toolbar=findViewById(R.id.form_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        acara=findViewById(R.id.acara);
        nim=findViewById(R.id.nim);
        nama=findViewById(R.id.nama);
        judul=findViewById(R.id.judul);
        narasumber1=findViewById(R.id.sp_dosen1);
        narasumber2=findViewById(R.id.sp_dosen2);
        narasumber3=findViewById(R.id.sp_dosen3);
        waktu=findViewById(R.id.waktu);
        waktu.setText(getIntent().getStringExtra("waktu"));
        simpan=findViewById(R.id.simpan);
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FormAgenda.this,MainActivity.class);
                intent.putExtra("acara",acara.getText().toString());
                intent.putExtra("nim",nim.getText().toString());
                intent.putExtra("nama",nama.getText().toString());
                intent.putExtra("judul",judul.getText().toString());
                intent.putExtra("narasumber1",narasumber1.getSelectedItem().toString());
                intent.putExtra("narasumber2",narasumber2.getSelectedItem().toString());
                intent.putExtra("narasumber3",narasumber3.getSelectedItem().toString());
                startActivity(intent);

            }
        });
    }
}
