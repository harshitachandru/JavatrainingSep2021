public class Studentclass1 extends Question1
{
    private String Name;
    private String Email;
    private int Phoneno;

    public Studentclass1( String Name1, int phone1, String Email1)
    {
        this.Name = Name1;
        this.Phoneno = phone1;
        this.Email = Email1;
    }


    public String getName() {
        return Name;
    }

    public void setName(String NewName) {
        this.Name = NewName;
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
        return "Name: "+this.getName()+
        " | Phone Number. "+this.getphoneNo()+
        " | Email-Id: "+ this.getemail();
    }

}
