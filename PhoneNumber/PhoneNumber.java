public class PhoneNumber {
    private String countryCode;
    private String number;

    public PhoneNumber(String countryCode, String number) {
        if (number.length() != 12) {
            throw new IllegalArgumentException("number must be 12 digits");
        }
        this.countryCode = countryCode;
        this.number = number;
    }

    public String toString() {
        return "Country Code: " + countryCode + ", Number: " + number;
    }
}
