package robbyturnip333.gmail.com.siperan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.Date;

public class FormAgenda extends AppCompatActivity {
   android.support.v7.widget.Toolbar toolbar;
   EditText acara,nim,nama,judul;
   Spinner ruang;
   TextView tanggal;

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
        ruang=findViewById(R.id.sp_ruang);
        tanggal=findViewById(R.id.tanggal);
        tanggal.setText(getIntent().getStringExtra("tanggal"));

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.form_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem){
        int id= menuItem.getItemId();
        if(id==R.id.simpan){
            Intent intent=new Intent(FormAgenda.this,MainActivity.class);
            intent.putExtra("acara",acara.getText().toString());
            intent.putExtra("nim",nim.getText().toString());
            intent.putExtra("nama",nama.getText().toString());
            intent.putExtra("judul",judul.getText().toString());
            intent.putExtra("tanggal",tanggal.getText().toString());
            intent.putExtra("waktu","10:00");
            intent.putExtra("ruang",ruang.getSelectedItem().toString());
            startActivity(intent);
            return true;
        }
        return  super.onOptionsItemSelected(menuItem);
    }
}
