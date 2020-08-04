/*
Name:-Afraz Asher Asrar
Roll Number:- 303-BSCS-19(E1)
*/
public class Dog
{
  protected String Name;
  // Setter method
  public void setName(String Name)
  {
	  this.Name=Name;
  }
  // Getter method
  public String getName()
  {
	  return Name;
  }
  // Dog constructor
  public Dog(String Name)
  {
	  this.Name=Name;
  }
  public void Speak()
  {   
	  System.out.println("Woof");
  }

}