import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;


public class PetTracker {

	public static void main(String[] args) {
		
		int i=0;
		int dateDay=0;
		double amtSold=0;
		int amtPetSold=0;
		int daything=0;
		int amtPetNotSold=0;
		String petName= "";
		Date now = new Date(dateDay);
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		
		int counta = 1;
		Pets[] pArray = new Pets[999];
		
		Pets defaultPet = new Pets();
		defaultPet.setAge(5);
		defaultPet.setDateFed(false);
		defaultPet.setName("fff");
		defaultPet.setDcount(5);
		defaultPet.setPrice(5);
		defaultPet.setSold(false);
		defaultPet.setSpecies("ffff");
		pArray[0] = defaultPet;
		
		Scanner user_input = new Scanner(System.in);
		
		//String restart = "n";
		do {
			System.out.println("Enter 1-3 for the coresponding option: \n"+"1: Enter a new Pet \n"+"2: Sell a pet by ID \n"+"3: Reports");
			
		
			int option = Integer.parseInt(user_input.next());
			int petId=1;
			if(option==1) {
				counta++;
				pArray[petId] = new Pets();
				pArray[petId].setIdNum(petId);
				
				
				System.out.print("Enter the name of the pet: ");
				petName = user_input.next();
				pArray[petId].setName(petName);
				System.out.print("How old is " + petName + ": ");
				int petAge = Integer.parseInt(user_input.next());
				pArray[petId].setAge(petAge);
				System.out.print("What species is " + petName + ": ");
				String petSpecies = user_input.next();
				pArray[petId].setSpecies(petSpecies);
				System.out.print("How much is " + petName +" going to be sold for: ");
				double petPrice = Double.parseDouble(user_input.next());
				pArray[petId].setPrice(petPrice);
				System.out.print("Has " + petName + " been fed y for yes n for no: ");
				if(user_input.next()== "y")
				{
					pArray[petId].setDateFed(true);
				}else{
					pArray[petId].setDateFed(false);
				}
				
				pArray[petId].setSold(false);
				pArray[petId].setDate(now);
				
				petId++;
			
			}else if(option==2) {
				System.out.println("What is the ID of the pet being sold: ");
				int petSoldId = Integer.parseInt(user_input.next());
				pArray[petSoldId].petGotSold(true);
				amtSold += pArray[petSoldId].getPrice();
				//pArray[petId].setDate(now);
				
				
				
			}else if(option==3) {
				
		     	System.out.println("How many days would you like to review please enter a whole number: ");
				i = Integer.parseInt(user_input.next());
				int soldtotal=0;
				int revenue = 0;
				
				for(int in=0; in<=counta-1; in++)
					{
						
						if(pArray[in].getSold() == true)
						{
							soldtotal++;
							revenue += pArray[in].getPrice();
						}else {
							 if(pArray[in].getFed()==true)
							 {
								 System.out.println("PetID: "+pArray[in].getIdNum() + " has been fed");
							 }else {
								 System.out.println("PetID: "+pArray[in].getIdNum() + " has not been fed");
							 }
							
						   
						}
						
						
					}
					
				System.out.println("Pets Sold: "+soldtotal);
				System.out.println("Profit: "+ revenue);
				
				
				
				
				
			
			}else {
				System.out.println(option + " is not a valid option");
			
			}
			boolean competent=true;
			
			
		}while(true);
	}		

	
	
	public void findPet(int i)
	{
	    
	}

	

}
