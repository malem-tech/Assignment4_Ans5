public class Main 
{
    public static void main( String[] args )
    {
        IndividualHolder obj = new IndividualHolder(AccountHolder.getNextID(), "University Village", "Student", "ABC1234");
		Account acc = new Account(4000, obj);
		
		System.out.println("Current Balance: " +acc.getBalance());
		acc.withdraw(1000); 
		System.out.println("Updated Balance: " +acc.getBalance());
		
		System.out.println("Name: " +obj.getName());

		obj.setName("Malem");
		System.out.println(obj.getName());
    }
}
