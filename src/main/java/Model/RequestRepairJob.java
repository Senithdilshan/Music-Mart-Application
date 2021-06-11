package Model;

public class RequestRepairJob extends MusicMart {

    public int CusID;
    public String InsName;
    public String RNote;

    public RequestRepairJob(int CusID, String InsName, String RNote) {
        this.CusID = CusID;
        this.InsName = InsName;
        this.RNote = RNote;
    }

}
