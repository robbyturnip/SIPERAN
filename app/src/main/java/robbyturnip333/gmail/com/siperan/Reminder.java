package robbyturnip333.gmail.com.siperan;

/**
 * Created by robby on 24/12/18.
 */

public class Reminder {
    String acara,nama,nim,judul,waktu,ruang,narasumber1,narasumber2,narasumber3;
    public Reminder(){};

    public Reminder(String Acara, String nama, String nim, String judul,String waktu, String ruang, String narasumber1, String narasumber2, String narasumber3){
        this.acara=acara;
        this.nama=nama;
        this.nim=nim;
        this.waktu=waktu;
        this.ruang=ruang;
        this.judul=judul;
        this.narasumber1=narasumber1;
        this.narasumber2=narasumber2;
        this.narasumber3=narasumber3;
    }

    public void setAcara(String acara){
        this.acara=acara;
    }
    public  void setNama(String nama){
        this.nama=nama;
    }
    public void setNim(String nim){
        this.nim=nim;
    }
    public void setJudul(String judul){
        this.judul=judul;
    }
    public void setWaktu(String waktu){
        this.waktu=waktu;
    }
    public void  setRuang(String ruang){this.ruang=ruang;}
    public void setNarasumber1(String narasumber1){
        this.narasumber1=narasumber1;
    }
    public void setNarasumber2(String narasumber2){
        this.narasumber2=narasumber2;
    }
    public void setNarasumber3(String narasumber3){
        this.narasumber3=narasumber3;
    }
    public String getAcara(){
        return acara;
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getJudul(){
        return judul;
    }
    public String getWaktu(){
        return waktu;
    }
    public String getRuang(){
        return ruang;
    }
    public String getNarasumber1(){
        return narasumber1;
    }
    public String getNarasumber2(){
        return narasumber2;
    }
    public String getNarasumber3(){
        return narasumber3;
    }
}
