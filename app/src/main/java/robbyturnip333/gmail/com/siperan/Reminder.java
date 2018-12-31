package robbyturnip333.gmail.com.siperan;

/**
 * Created by robby on 24/12/18.
 */

public class Reminder {
    String mytitle,name,nim,mytime,room;
    public Reminder(String title, String name, String nim, String time, String room){
        this.mytitle=title;
        this.name=name;
        this.nim=nim;
        this.mytime=time;
        this.room=room;
    }

    public void setMytitle(String title){
        this.mytitle=title;
    }
    public  void setName(String name){
        this.name=name;
    }
    public void setNim(String nim){
        this.nim=nim;
    }
    public void setMytime(String time){
        this.mytime=time;
    }
    public void  setRoom(String room){
        this.room=room;
    }
    public String getMytitle(){
        return mytitle;
    }
    public String getName(){
        return name;
    }
    public String getNim(){
        return nim;
    }
    public String getMytime(){
        return mytime;
    }
    public String getRoom(){
        return room;
    }
}
