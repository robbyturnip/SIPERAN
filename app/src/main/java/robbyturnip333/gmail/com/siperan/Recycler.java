package robbyturnip333.gmail.com.siperan;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by robby on 24/12/18.
 */

public class Recycler extends RecyclerView.Adapter<Recycler.MyRecycle> {
    public ArrayList<Reminder> reminders;
    public  Recycler(ArrayList<Reminder> reminder){
        this.reminders=reminder;
    }
    public class MyRecycle extends RecyclerView.ViewHolder{
        TextView judul,nama,nims,waktu,ruang;
        public MyRecycle(View view){
            super(view);
            judul=view.findViewById(R.id.title);
            nama=view.findViewById(R.id.name_mhs);
            nims=view.findViewById(R.id.nim_mhs);
            waktu=view.findViewById(R.id.time);
            ruang=view.findViewById(R.id.room);
        }
    }
    public MyRecycle onCreateViewHolder(ViewGroup viewGroup,int index){
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View view=layoutInflater.inflate(R.layout.cardview_reminder,viewGroup,false);
        return (new MyRecycle(view));
    }
    public void onBindViewHolder(MyRecycle myRecycle,int index){
        myRecycle.judul.setText(reminders.get(index).getMytitle());
        myRecycle.nama.setText(reminders.get(index).getName());
        myRecycle.nims.setText(reminders.get(index).getNim());
        myRecycle.waktu.setText(reminders.get(index).getMytime());
        myRecycle.ruang.setText(reminders.get(index).getRoom());

    }
    public int getItemCount(){
        return (reminders!=null) ? reminders.size():0;
    }

}
