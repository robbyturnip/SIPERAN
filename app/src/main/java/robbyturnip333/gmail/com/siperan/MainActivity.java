package robbyturnip333.gmail.com.siperan;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Calendar;




public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    ArrayList<Reminder> reminders;
    Recycler recycler;
    CalendarView calendarView;
    Calendar calendar;
    FloatingActionButton floatingActionButton;
    SaveLastDateSelected saveLastDateSelected;
    int theDayofWeek,theDay,theMonth,theYear,dayInt,months,day,year;
    public String selectedDayInt,selectedDay,selectedMonth,selectedYear,selectedDate, newSelectedDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);
        reminders=new ArrayList<>();
        saveLastDateSelected=new SaveLastDateSelected();
        calendar=Calendar.getInstance();
        addData();
        recyclerView=findViewById(R.id.recyclerView);
        recycler=new Recycler(reminders);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recycler);
        floatingActionButton=findViewById(R.id.add);
        calendarView=findViewById(R.id.calender);
        Toast.makeText(MainActivity.this, " INININI "+saveLastDateSelected.getCondition(), Toast.LENGTH_SHORT).show();
        if(saveLastDateSelected.getCondition()) {
            calendar.set(Calendar.YEAR, saveLastDateSelected.getYear());
            calendar.set(Calendar.MONTH, saveLastDateSelected.getMonth());
            calendar.set(Calendar.DAY_OF_MONTH, saveLastDateSelected.getDay());
            long nowSelectedDate = calendar.getTimeInMillis();
            calendarView.setDate(nowSelectedDate,true,true);
            dayInt=saveLastDateSelected.getDay();
            months=saveLastDateSelected.getMonth();
            year=saveLastDateSelected.getYear();
            day=saveLastDateSelected.getDayweek();
            switch (day) {
                case Calendar.SUNDAY:
                    selectedDay="Minggu";
                    break;
                case Calendar.MONDAY:
                    selectedDay="Senin";
                    break;
                case Calendar.TUESDAY:
                    selectedDay="Selasa";
                    break;
                case Calendar.WEDNESDAY:
                    selectedDay="Rabu";
                    break;
                case Calendar.THURSDAY:
                    selectedDay="Kamis";
                    break;
                case Calendar.FRIDAY:
                    selectedDay="Jumat";
                    break;
                case Calendar.SATURDAY:
                    selectedDay="Sabtu";
                    break;
            }
            switch (months) {
                case Calendar.JANUARY:
                    selectedMonth="Januari";
                    break;
                case Calendar.FEBRUARY:
                    selectedMonth="Februari";
                    break;
                case Calendar.MARCH:
                    selectedMonth="Maret";
                    break;
                case Calendar.APRIL:
                    selectedMonth="April";
                    break;
                case Calendar.MAY:
                    selectedMonth="Mei";
                    break;
                case Calendar.JUNE:
                    selectedMonth="Juni";
                    break;
                case Calendar.JULY:
                    selectedMonth="Juli";
                    break;
                case Calendar.AUGUST:
                    selectedMonth="Agustus";
                    break;
                case Calendar.SEPTEMBER:
                    selectedMonth="September";
                    break;
                case Calendar.OCTOBER:
                    selectedMonth="Oktober";
                    break;
                case Calendar.NOVEMBER:
                    selectedMonth="November";
                    break;
                case Calendar.DECEMBER:
                    selectedMonth="Desember";
            }
            selectedYear=String.valueOf(year);
            selectedDayInt=String.valueOf(dayInt);
            selectedDate=selectedDay+", "+selectedDayInt+" "+selectedMonth+" "+selectedYear;
            saveLastDateSelected.setCondition(true);
            Toast.makeText(MainActivity.this, selectedDay+", "+selectedDayInt+" "+selectedMonth+" "+selectedYear, Toast.LENGTH_SHORT).show();
        }
        else {
            day = calendar.get(Calendar.DAY_OF_WEEK);
            months = calendar.get(Calendar.MONTH);
            dayInt = calendar.get(Calendar.DAY_OF_MONTH);
            year = calendar.get(Calendar.YEAR);


            switch (day) {
                case Calendar.SUNDAY:
                    selectedDay = "Minggu";
                    break;
                case Calendar.MONDAY:
                    selectedDay = "Senin";
                    break;
                case Calendar.TUESDAY:
                    selectedDay = "Selasa";
                    break;
                case Calendar.WEDNESDAY:
                    selectedDay = "Rabu";
                    break;
                case Calendar.THURSDAY:
                    selectedDay = "Kamis";
                    break;
                case Calendar.FRIDAY:
                    selectedDay = "Jumat";
                    break;
                case Calendar.SATURDAY:
                    selectedDay = "Sabtu";
                    break;
            }
            switch (months) {
                case Calendar.JANUARY:
                    selectedMonth = "Januari";
                    break;
                case Calendar.FEBRUARY:
                    selectedMonth = "Februari";
                    break;
                case Calendar.MARCH:
                    selectedMonth = "Maret";
                    break;
                case Calendar.APRIL:
                    selectedMonth = "April";
                    break;
                case Calendar.MAY:
                    selectedMonth = "Mei";
                    break;
                case Calendar.JUNE:
                    selectedMonth = "Juni";
                    break;
                case Calendar.JULY:
                    selectedMonth = "Juli";
                    break;
                case Calendar.AUGUST:
                    selectedMonth = "Agustus";
                    break;
                case Calendar.SEPTEMBER:
                    selectedMonth = "September";
                    break;
                case Calendar.OCTOBER:
                    selectedMonth = "Oktober";
                    break;
                case Calendar.NOVEMBER:
                    selectedMonth = "November";
                    break;
                case Calendar.DECEMBER:
                    selectedMonth = "Desember";
            }
            selectedYear = String.valueOf(year);
            selectedDayInt = String.valueOf(dayInt);
            selectedDate = selectedDay + ", " + selectedDayInt + " " + selectedMonth + " " + selectedYear;
            saveLastDateSelected.setCondition(true);
            Toast.makeText(MainActivity.this, selectedDay + ", " + selectedDayInt + " " + selectedMonth + " " + selectedYear, Toast.LENGTH_SHORT).show();
        }
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(year, month, dayOfMonth);
                    theDay=dayOfMonth;
                    theMonth=month;
                    theYear=year;
                    int day = calendar.get(Calendar.DAY_OF_WEEK);
                    theDayofWeek=day;
                    int months = calendar.get(Calendar.MONTH);
                    switch (day) {
                        case Calendar.SUNDAY:
                            selectedDay="Minggu";
                            break;
                        case Calendar.MONDAY:
                            selectedDay="Senin";
                            break;
                        case Calendar.TUESDAY:
                            selectedDay="Selasa";
                            break;
                        case Calendar.WEDNESDAY:
                            selectedDay="Rabu";
                            break;
                        case Calendar.THURSDAY:
                            selectedDay="Kamis";
                            break;
                        case Calendar.FRIDAY:
                            selectedDay="Jumat";
                            break;
                        case Calendar.SATURDAY:
                            selectedDay="Sabtu";
                            break;
                    }
                switch (months) {
                    case Calendar.JANUARY:
                        selectedMonth="Januari";
                        break;
                    case Calendar.FEBRUARY:
                        selectedMonth="Februari";
                        break;
                    case Calendar.MARCH:
                        selectedMonth="Maret";
                        break;
                    case Calendar.APRIL:
                        selectedMonth="April";
                        break;
                    case Calendar.MAY:
                        selectedMonth="Mei";
                        break;
                    case Calendar.JUNE:
                        selectedMonth="Juni";
                        break;
                    case Calendar.JULY:
                        selectedMonth="Juli";
                        break;
                    case Calendar.AUGUST:
                        selectedMonth="Agustus";
                        break;
                    case Calendar.SEPTEMBER:
                        selectedMonth="September";
                        break;
                    case Calendar.OCTOBER:
                        selectedMonth="Oktober";
                        break;
                    case Calendar.NOVEMBER:
                        selectedMonth="November";
                        break;
                    case Calendar.DECEMBER:
                        selectedMonth="Desember";
                }
                    selectedYear=String.valueOf(year);
                    selectedDayInt=String.valueOf(dayOfMonth);
                    selectedDate = selectedDay + ", " + selectedDayInt + " " + selectedMonth + " " + selectedYear;
                    SaveLastDateSelected saveLastDateSelected=new SaveLastDateSelected();
                    saveLastDateSelected.setYear(theYear);
                    saveLastDateSelected.setMonth(theMonth);
                    saveLastDateSelected.setDay(theDay);
                    saveLastDateSelected.setDayweek(theDayofWeek);
                    saveLastDateSelected.setCondition(true);
                    Toast.makeText(MainActivity.this, selectedDay+", "+selectedDayInt+" "+selectedMonth+" "+selectedYear, Toast.LENGTH_SHORT).show();
            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FormAgenda.class);
                intent.putExtra("tanggal",selectedDate);
                intent.putExtra("noToDisplay","yes");
                startActivity(intent);

            }
        });
    }
    public void addData(){
        Reminder reminder=new Reminder();
        reminder.setAcara(getIntent().getStringExtra("acara"));
        reminder.setJudul(getIntent().getStringExtra("judul"));
        reminder.setNama(getIntent().getStringExtra("nama"));
        reminder.setNim(getIntent().getStringExtra("nim"));
        reminder.setTanggal(getIntent().getStringExtra("tanggal"));
        reminder.setWaktu(getIntent().getStringExtra("waktu"));
        reminder.setRuang(getIntent().getStringExtra("ruang"));
        reminders.add(reminder);

    }



}


