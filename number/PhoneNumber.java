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

    public String getCountryCode() {
        return countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return String.format("+%s %s", countryCode, number);
    }
}
