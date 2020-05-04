import java.util.Scanner;


class Member {
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;
    
    public Member() {
        System.out.println("Parent Constructor with no parameter");
    }
    public Member(String pName, int pMemberID, int pMemberSince) {
        System.out.println("Parent Constructor with 3 parameters");
        
        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    }
    
    public int getDiscount() {
        return discount;
    }
    
    public void setDiscount() {
        Scanner input = new Scanner(System.in);
        String password;
        System.out.println("Please enter the admin password:");
        password = input.nextLine();
        
        if (!password.equals("abcd")) {
            System.out.println("Invalid password. You do not have authority to edit the discount.");
        } else {
            System.out.println("Please enter the discount:");
            discount = input.nextInt();
        }
     }
    
    public void displayMemInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since " + memberSince);
        System.out.println("Annual Fee: " + annualFee);
    }
    
    public void calculateAnnualFee() {
        annualFee = 0;
    }
    
    public static void main(String[] args) {
        NormalMember mem1 = new NormalMember("James", 1, 2010);
        VIPMember mem2 = new VIPMember("Andy", 2, 2011);
        
        mem1.calculateAnnualFee();
        mem2.calculateAnnualFee();
        
        mem1.displayMemInfo();
        mem2.displayMemInfo();
        
        mem1.setDiscount();
        
        mem1.calculateAnnualFee();
        mem1.displayMemInfo();
    }
}
