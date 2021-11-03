import java.util.HashMap;

public class Person {

    private String name, phoneno, height, gender, mstatus;

    public Person(String newName, String newPhone, String newheight, String newgender, String newstatus) 
    {
        this.name = newName;
        this.phoneno = newPhone;
        this.height = newheight;
        this.gender = newgender;
        this.mstatus = newstatus;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phoneno;
    }

    public void setPhone(String phone) {
        this.phoneno = phone;
    }

    public String getheight() {
        return height;
    }

    public void setheight(String height) {
        this.height = height ;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getmstatus() {
        return mstatus;
    }

    public void setmstatus(String mstatus) {
        this.mstatus = mstatus;
    }

    public HashMap<String, Object> getPersonData(){
        HashMap<String, Object> personData = new HashMap<>();
        personData.put("name", this.name);
        personData.put("phone", this.phoneno);
        personData.put("height", this.height);
        personData.put("gender", this.gender);
        personData.put("mstatus", this.mstatus);
        return personData;
    }
}
