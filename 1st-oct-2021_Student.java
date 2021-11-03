import java.util.HashMap;

public class Student 
{

    private String name, phone, age;

    public Student(String newName, String phone2, String age2) {
        this.name = newName;
        this.phone = phone2;
        this.age = age2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public String setAge(String age) {
        return this.age = age;
    }

    public HashMap<String, Object> getstudentData(){
        HashMap<String, Object> personData = new HashMap<>();
        personData.put("name", this.name);
        personData.put("phone", this.phone);
        personData.put("age", this.age);
        return personData;
    }

}
