import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public List<BuddyInfo> getBuddies() {
        return buddies;
    }

    public static void main(String[] args) {
        System.out.println("Address book");
        AddressBook book = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Homer", "123 Main Street", "613-555-1234");
        book.addBuddy(buddy);
        book.removeBuddy(buddy);
    }
}