public class NormalMember extends Member {
    
    public NormalMember() {
        System.out.println("Child Constructor with no parameter");
    }
    
    public NormalMember(String pName, int pMemberID, int pMemberSince) {
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }
    
    @Override
    public void calculateAnnualFee() {
        annualFee = (1-0.01*getDiscount())*(100 + 12*30);
    }
    
    public static void main(String[] args) {
        //System.out.println(name);
        NormalMember normie = new NormalMember("Jim", 1, 12343);
        normie.calculateAnnualFee();
        System.out.println(normie.annualFee);
    }
}
