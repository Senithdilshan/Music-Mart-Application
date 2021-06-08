package Model;

public class UserReg extends MusicMart{
    public String UserDetail;
    public UserReg(String AdminName,String AdminPassword)
    {
        super(AdminName,AdminPassword);
    }
    
    public String getUser()
    {
        return UserDetail;
    }
    @Override
    public String getForm(){
        UserDetail=super.getAdmin();
        return UserDetail;
    }
    
}
