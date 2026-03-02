package TELEPHONE_DIRECTORY_CODE;


public class TelephoneRecord {

    private String personName;
    private String areaCode;
    private String phoneNumber;

    // Constructor
    public TelephoneRecord(String personName, String areaCode, String phoneNumber) {
        this.personName = personName;
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getPersonName() {
        return personName;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}