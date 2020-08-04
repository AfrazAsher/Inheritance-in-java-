/*
Name:-Afraz Asher Asrar
Roll Number:- 303-BSCS-19(E1)
*/
public class Labrador extends Dog
{
  public String Color;
  public int breedWeight = 50;
  // Setter methods
  public void setColor(String Color)
  {
	  this.Color=Color;
  }
  public void setBreedWeight(int breedWeight)
  {
	  this.breedWeight=breedWeight;
  }
  // Getter methods
  public String getColor()
  {
	  return Color;
  }
  public int getBreedWeight()
  {
	  return breedWeight;
  }
  // Labrador constructor
  public Labrador(String Color)
  {   
	  this.Color=Color;
  }
  // BreedWeight method
  public int avgBreedWeight()
  {
      return breedWeight;
  }
  // overiding the "Speak" method here 
  public void Speak()
  {   
      //@override
	  super.Speak();
	  System.out.println("Woof");
  }

}