package Collections.SetInterface;
import java.util.*;
import java.time.LocalDate;

/*
     Insurance policy management System
     classes: policy
     policy attributes:  Policy Number (unique identifier), Policyholder Name, Expiry Date, Coverage Type (e.g., Health, Auto, Home), Premium Amount
 */
class Policy{
    private int policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    public String coverageType;
    private double premiumAmount;

    public Policy(int policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType, double premiumAmount){
        this.policyNumber=policyNumber;
        this.policyHolderName=policyHolderName;
        this.expiryDate=expiryDate;
        this.coverageType=coverageType;
        this.premiumAmount=premiumAmount;
    }

    public int getPolicyNumber(){
        return policyNumber;
    }

    public LocalDate getExpiryDate(){
        return expiryDate;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Policy)){
            return false;
        }
        Policy other=(Policy) obj;
        return policyNumber==other.policyNumber;
    }


    public int hashCode(){
        return  Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return "Policy Number: "+policyNumber+
                ", Policyholder: "+policyHolderName+
                ", Expiry Date: "+expiryDate+
                ", Coverage: "+coverageType+
                ", Premium: "+premiumAmount;
    }

    public boolean expiriongSoon(){
        LocalDate today=LocalDate.now();
        LocalDate boundary=today.plusDays(30);

        return !expiryDate.isBefore(today) && !expiryDate.isAfter(boundary);
    }

    public boolean specificCoverageTypePolicies( String targetCoverage){
        if(coverageType.equalsIgnoreCase(targetCoverage)){
            return true;
        }
        return  false;
    }

    public static void duplicatePolicyNumbers(Set<Policy> hashSet){
        Set<Integer> policyNumbers=new HashSet<>();
        boolean found=false;
        for(Policy policy:hashSet){
            if(!policyNumbers.add(policy.getPolicyNumber())){
                System.out.println(policy.toString());
                found=true;
            }
        }
        if(!found){
            System.out.println("No duplicates found");
        }
    }
}

public class InsurancePolicyManagement {
    public static void main(String[] args){
        //scanner object
        Scanner input=new Scanner(System.in);

        //create sets
        Set<Policy> hashSet=new HashSet<>();
        Set<Policy> linkedHashSet=new LinkedHashSet<>();

        Comparator<Policy> comparator=Comparator.comparing(Policy::getExpiryDate).thenComparing(Policy::getPolicyNumber);
        Set<Policy> treeSet=new TreeSet<>(comparator);

        //create policies
        Policy p1=new Policy(101,"Arun", LocalDate.of(2027,5,10),"Health",12000);
        Policy p2=new Policy(102,"Priya", LocalDate.of(2026,11,20),"Auto",8000);
        Policy p3=new Policy(103,"Rahul", LocalDate.of(2027,2,15),"Home",15000);
        Policy p4=new Policy(101,"Arun", LocalDate.of(2027,5,10),"Health",12000);

        //adding policies to the sets
        Policy[] policies={p1,p2,p3,p4};
        for(Policy policy:policies){
            hashSet.add(policy);
            linkedHashSet.add(policy);
            treeSet.add(policy);
        }

        //dis[playing the policies
        for(Policy policy:policies){
            System.out.println(policy.toString());
        }

        //displaying all the policies that are expiring soon (within 30days)
        System.out.println("The policies expiring soon are: ");
        for(Policy policy:policies){
            if(policy.expiriongSoon()){
                System.out.println(policy.toString());
            }
        }

        //displaying the policies with specific coverage type
        System.out.println("\nEnter the coverage type: ");
        String targetCoverageType=input.nextLine();
        for(Policy policy:policies){
            if(policy.specificCoverageTypePolicies(targetCoverageType)){
                System.out.println(policy.toString());
            }
        }

        //duplicate policies based on policyNumbers
        Policy.duplicatePolicyNumbers(hashSet);


    }
}
