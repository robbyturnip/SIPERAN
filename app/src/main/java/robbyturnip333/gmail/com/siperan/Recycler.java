package robbyturnip333.gmail.com.siperan;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robby on 24/12/18.
 */

public class Recycler extends RecyclerView.Adapter<Recycler.MyRecycle> {
    public ArrayList<Reminder> reminders;

    public  Recycler(ArrayList<Reminder> reminder){this.reminders=reminder;}

    public class MyRecycle extends RecyclerView.ViewHolder{
        Reminder reminder;
        TextView acara,nama,nims,waktu,ruang,tanggal;
        public MyRecycle(View view){
            super(view);
            acara=view.findViewById(R.id.acara);
            nama=view.findViewById(R.id.name_mhs);
            nims=view.findViewById(R.id.nim_mhs);
            waktu=view.findViewById(R.id.time);
            ruang=view.findViewById(R.id.room);
            tanggal=view.findViewById(R.id.date);
        }
    }
    public MyRecycle onCreateViewHolder(ViewGroup viewGroup,int index){
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view=layoutInflater.inflate(R.layout.cardview_reminder,viewGroup,false);
        MyRecycle myRecycle=new MyRecycle(view);
        return myRecycle;
    }
    public void onBindViewHolder(MyRecycle myRecycle,int index){
        Reminder reminder=reminders.get(index);
        myRecycle.acara.setText(reminder.getAcara());
        myRecycle.nama.setText(reminder.getNama());
        myRecycle.nims.setText(reminder.getNim());
        myRecycle.tanggal.setText(reminder.getTanggal());
        myRecycle.waktu.setText(reminder.getWaktu());
        myRecycle.ruang.setText(reminder.getRuang());
        myRecycle.reminder=reminder;

    }
    public int getItemCount(){return reminders.size();}

}
