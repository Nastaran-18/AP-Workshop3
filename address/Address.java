public class Address {

    private String zipCode;
    private String country;
    private String city;
    private String email;

    public Address(String zipcode, String country, String city, String email) {
        this.zipCode = zipcode != null ? zipcode : "";
        this.country = country != null ? country : "";
        this.city = city != null ? city : "";
        this.email = email != null ? email : "";
    }


    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode != null ? zipCode : "";
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country != null ? country : "";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city != null ? city : "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email != null ? email : "";
    }

    @Override
    public String toString() {
        return String.format("Address: %s, %s, %s, %s", city, country, zipCode, email);
    }
}
