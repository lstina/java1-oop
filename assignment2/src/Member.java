import java.time.LocalDate;

// Superklassen Member
public class Member {
    private String name;
    private String address;
    private String email;
    private String personalNumber;
    private LocalDate membershipStart;
    private LocalDate lastPaidDate;
    private String membershipType;

    // Konstruktor

    public Member(String name, String address, String email, String personalNumber, LocalDate membershipStart, LocalDate lastPaidDate, String membershipType) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.personalNumber = personalNumber;
        this.membershipStart = membershipStart;
        this.lastPaidDate = lastPaidDate;
        this.membershipType = membershipType;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public LocalDate getMembershipStart() {
        return membershipStart;
    }

    public LocalDate getLastPaidDate() {
        return lastPaidDate;
    }

    public String getMembershipType() {
        return membershipType;
    }

}
