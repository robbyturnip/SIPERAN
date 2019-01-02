package robbyturnip333.gmail.com.siperan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.Date;

public class FormAgenda extends AppCompatActivity {
   android.support.v7.widget.Toolbar toolbar;
   Button simpan;
//   EditText acara,nim,nama,judul,;
   TextView waktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_agenda);
        toolbar=findViewById(R.id.form_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        waktu=findViewById(R.id.waktu);
        waktu.setText(getIntent().getStringExtra("waktu"));
        simpan=findViewById(R.id.simpan);
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
