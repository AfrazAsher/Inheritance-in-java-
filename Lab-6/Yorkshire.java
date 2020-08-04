/*
Name:-Afraz Asher Asrar
Roll Number:- 303-BSCS-19(E1)
*/
public class Yorkshire extends Dog
{
  // Setter methods
  public void setName(String Name)
  {
	  this.Name=Name;
  }
  // Getter methods
  public String getName()
  {
	  return Name;
  }
  // Yorkshire constructor
  public Yorkshire(String Name)
  {   
      super(Name);
  }
  // overiding the "Speak" method here
  public void Speak()
  {   
      // @override
      super.Speak();
	  System.out.println("Woof");
  }
}