/**
 * runs main program; create instance of PhoneDirectory
 * @author Brittany
 *
 */
public class Driver {

	public static void main(String[] args) {
		String n = "pdirectory";
		String name1="Vanessa Ramsay";
		String name2 = "Candice Williams";
		String phone1 = "973-212-8888";
		String phone2 = "401-124-1299";
		PhoneDirectory phonelist1 = new PhoneDirectory();
		PhoneDirectory phonelist2 = new PhoneDirectory(n);
		
		phonelist1.addorChangeEntry(name1, phone1);
		phonelist1.addorChangeEntry(name2, phone2);
		phonelist2.addorChangeEntry(name1, phone1);
		phonelist2.addorChangeEntry(name2, phone2);
		
		phonelist1.deleteEntry("Vanessa Ramsay");
		String found = phonelist2.lookup("Brittany Miller");
		System.out.println(found);
		phonelist1.write();
		phonelist2.write();
		
		
	}

}
