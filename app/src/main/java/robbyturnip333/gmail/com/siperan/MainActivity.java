package robbyturnip333.gmail.com.siperan;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.transition.AutoTransition;
import android.support.transition.Transition;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;

import com.applandeo.materialcalendarview.CalendarView;

import java.util.ArrayList;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    ArrayList<Reminder> reminders;
    Recycler recycler;
    RelativeLayout relativeLayout;
    CalendarView calendarView;
    FloatingActionButton floatingActionButton;

    public static final String RESULT = "result";
    public static final String EVENT = "event";
    private static final int ADD_NOTE = 44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);
        addData();
        recyclerView=findViewById(R.id.recyclerView);
        recycler=new Recycler(reminders);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recycler);
        floatingActionButton=findViewById(R.id.add);
        calendarView=findViewById(R.id.calender);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FormAgenda.class);
                startActivity(intent);
            }
        });

    }
    public void addData(){
        reminders=new ArrayList<>();
        reminders.add(new Reminder("Seminar Judul Skripsi","Robby Maulana Turniip", "155410114", "10:00","B.1.4"));
        reminders.add(new Reminder("Seminar Pra Skripsi","Robby Maulana Turniip", "155410114", "13:00","B.1.1"));
        reminders.add(new Reminder("Pendadaran ","Robby Maulana Turniip", "155410114", "10:00","R.Pendadaran"));
        reminders.add(new Reminder("Seminar Judul Skripsi","Robby Maulana Turniip", "155410114", "10:00","B.1.4"));
        reminders.add(new Reminder("Seminar Pra Skripsi","Robby Maulana Turniip", "155410114", "13:00","B.1.1"));
        reminders.add(new Reminder("Pendadaran ","Robby Maulana Turniip", "155410114", "10:00","R.Pendadaran"));

    }



}
