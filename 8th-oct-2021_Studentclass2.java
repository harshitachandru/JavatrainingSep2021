public class Studentclass2 extends Question2
{
    private static String Name;
    private String Email;
    private int Phoneno;


    public static String getName() {
        return Name;
    }

    public static void setName(String NewName) {
        Studentclass2.Name = NewName;
    }

    public String getemail() {
        return Email;
    }

    public void setemail(String NewEmail) {
        this.Email = NewEmail;
    }

    public int getphoneNo() {
        return Phoneno;
    }

    public void setRollNo(int NewPhoneNo) {
        this.Phoneno = NewPhoneNo;
    }

    public String toString(){
        return "Name: "+Studentclass2.getName()+
        " | Phone Number. "+this.getphoneNo()+
        " | Email-Id: "+ this.getemail();
    }

}
