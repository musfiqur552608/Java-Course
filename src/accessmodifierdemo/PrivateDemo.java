
package accessmodifierdemo;

public class PrivateDemo {
    private String fname = "Musfiqur";
    private String lname = "Rahman";
    private String email = "musfiq@dipti.com.bd";
    private int age = 23;
    
    //Getter
//    

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
