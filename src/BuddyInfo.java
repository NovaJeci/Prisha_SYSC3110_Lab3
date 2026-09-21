public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this("Unknown", "Unknown", "Unknown");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
/*
    static void main(){
        System.out.println("Hello world!");
    }
    */
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo(
                "Homer",
                "123 Main Street",
                "613-555-1234"
        );

        System.out.println("Hello " + buddy.getName());
    }
}