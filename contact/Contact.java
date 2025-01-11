public class Contact {

    private String group;
    private String email;
    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber;
    private Address address;

    public Contact(String group, String email,
                   String firstName, String lastName,
                   PhoneNumber phoneNumber, Address address) {
        this.group = group != null ? group : "";
        this.email = email != null ? email : "";
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return lastName;
    }
    public String toString() {
        return "Group: " + group + ", Email: " + email + ", Name: " + firstName + " " + lastName +
                ", Phone: [" + phoneNumber.toString() + "], Address: [" + address.toString() + "]";
    }
}
