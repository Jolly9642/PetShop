import java.util.Scanner;

//import java.util.Calendar;
import java.util.Date;


public class Pets {
	   private String name;
	   private String species;
	   private double price;
	   private boolean dateLastFed;
	   private boolean sold;
	   private int age;
	   private int id;
	   private double dCount;
	   private Date date;
	  
	   
	   //encapsulation use these methods
	   public Date getDate()
	   {
		   return date;
	   }
	   
	   public int getAge() {
	      return age;
	   }
	   public double getDcount()
	   {
		   return dCount;
	   }
	   public String getName() {
	      return name;
	   }

	   public int getIdNum() {
	      return id;
	   }
	   public double getPrice()
	   {
	      return price;
	   }
	   public boolean getFed()
	   {
		   return dateLastFed;
	   }
	   public boolean getSold()
	   {
		   return sold;
	   }
	   public String getSpecies()
	   {
		   return species;
	   }
	   
	   public void setDate(Date newDate)
	   {
		   date = newDate;
	   }
	   public void setDcount(double newDcount)
	   {
		   dCount = newDcount;
	   }
	   public void setAge( int newAge) {
	      age = newAge;
	   }

	   public void setName(String newName) {
	      name = newName;
	   }

	   public void setIdNum( int newId) {
	      id = newId;
	   }
	   public void setSpecies(String newSpecies)
	   {
		   species = newSpecies;
	   }
	   public void setDateFed(boolean newDateLastFed) {
		   dateLastFed = newDateLastFed;
	   }
	   public void setSold(boolean newSold )
	   {
		   sold = newSold;
	   }
	   public void setPrice(double newPrice) 
	   {
		   price = newPrice;
	   }
	   
	   
	  
	   //end encapsulation
	
	   public void petGotSold(boolean nowSold)
	   {
		   nowSold = true;
		   sold = nowSold;
	   }

}

