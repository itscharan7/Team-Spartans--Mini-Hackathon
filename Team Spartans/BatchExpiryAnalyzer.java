import java.util.Scanner;

public class BatchExpiryAnalyzer{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int currentYear=2026;

        int expiredCount=0;
        int soonCount=0;
        int freshCount=0;
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Enter Number of Batches:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("\n--------------------------------------------------------------------------");
            System.out.println("Enter Batch ID:");
            String batchId=sc.next();
            System.out.println("Enter Batch Year:");
            int batchYear=sc.nextInt();
            while (batchYear > currentYear) {
                System.out.println("Invalid Batch Year,Year cannot be greater than " + currentYear);
                System.out.println("Reenter Batch Year:");
                batchYear = sc.nextInt();
            }
            int age=currentYear-batchYear;
            String status;
            String risk;

            if (age>3) {
                status = "Expired";
                risk = "HIGH";
                expiredCount++;

            }
            else if(age>=2){
                status = "Expiring soon";
                risk = "MEDIUM";
                soonCount++;

            }
            else {
                status = "Fresh";
                risk = "Low";
                freshCount++;
            }
            System.out.println("\n--------------------  Batch Report  ------------------------");
            System.out.println("Batch ID :"+batchId);
            System.out.println("Batch Year :"+batchYear);
            System.out.println("Current Year :"+currentYear);
            System.out.println("Batch Age "+age);
            System.out.println("Status "+status);
            System.out.println("Risk Level "+risk);
            System.out.println("----------------------------------------------------------------");

            }

        System.out.println("\n --------------------------------------------------------------------------");
        System.out.println("                           BATCH SUMMARY                               ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Total Batches :"+n);
        System.out.println("Expired Batches :"+expiredCount);
        System.out.println("Expiring Batches :"+soonCount);
        System.out.println("Fresh Batches :"+freshCount);
        System.out.println("--------------------------------------------------------------------------");
        sc.close();



    }
}
