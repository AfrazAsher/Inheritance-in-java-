public class Labrador extends Dog
{
  public String Color;
  public int breedWeight = 50;
  public void setColor(String Color)
  {
	  this.Color=Color;
  }
  public void setBreedWeight(int breedWeight)
  {
	  this.breedWeight=breedWeight;
  }
  public String getColor()
  {
	  return Color;
  }
  public int getBreedWeight()
  {
	  return breedWeight;
  }
  // Labrador constructor
  public Labrador(String Name,String Color)
  {       
          super(Name);
	  this.Color=Color;
  }
  public int avgBreedWeight()
  {
      return breedWeight;
  }
  // overiding the "Speak" method here 
  public void Speak()
  {   
	  super.Speak();
  }

}
