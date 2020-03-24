import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String phoneNumber;
    private String address;
    private String gender;
    private String email;
    private String facebook;

    public User(String name, String phoneNumber, String address, String gender, String email, String facebook) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.facebook = facebook;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + '\n' +
                "Phone Number: " + getPhoneNumber() + '\n' +
                "Address: " + getAddress() + '\n' +
                "Gender: " + getGender() + '\n' +
                "Email: " + getEmail() + '\n' +
                "Facebook: " + getFacebook() + '\n';
    }
}
