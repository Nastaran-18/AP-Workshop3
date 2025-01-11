public class Address {

    private String zipCode;
    private String country;
    private String city;

    public Address(String zipcode, String country, String city) {
        this.zipCode = zipcode != null ? zipcode : "";
        this.country = country != null ? country : "";
        this.city = city != null ? city : "";
    }

    public String toString() {
        return "Zipcode: " + zipCode + ", Country Code: " + country+ ", City: " + city;
    }
}
