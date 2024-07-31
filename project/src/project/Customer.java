package project;

public class Customer {

    private String name;
    private int phoneNo;
    private String addrerss;
    private boolean membership;
    private int id;

    public Customer() {
        this(" ", 0, " ", false, 0);
    }

    public Customer(String name, int phoneNo, String addrerss, boolean membership, int id) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.addrerss = addrerss;
        this.membership = membership;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddrerss() {
        return addrerss;
    }

    public void setAddrerss(String addrerss) {
        this.addrerss = addrerss;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n-Name :" + name + "\n-Phone number : " + phoneNo + "\n-Addrerss : " + addrerss + "\n-Membership : " + membership + "\n-ID :" + id;
    }

}
