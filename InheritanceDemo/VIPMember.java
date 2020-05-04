public class VIPMember extends Member {
    
    public VIPMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }
    
    @Override
    public void calculateAnnualFee() {
        annualFee = (1-.01*getDiscount())*1200;
    }
    
    public static void main(String[] args) {
        VIPMember vip = new VIPMember("Billy", 2, 1245);
        vip.calculateAnnualFee();
        System.out.println(vip.annualFee);
    }
}
