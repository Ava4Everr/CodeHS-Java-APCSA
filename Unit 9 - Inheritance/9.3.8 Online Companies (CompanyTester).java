public class CompanyTester
{
    public static void main(String[] args)
    {
        Company company1 = new Company("Widget Company", "123 Main St", "Springfield", "OH");
        OnlineCompany onlineCompany1 = new OnlineCompany("CodeHS", "www.codehs.com");
        
        System.out.println("Company Details:");
        System.out.println(company1);
        
        System.out.println("Company Details:");
        System.out.println(onlineCompany1);
    }
}
