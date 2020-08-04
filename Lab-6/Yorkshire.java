public class Yorkshire extends Dog
{
  public void setName(String Name)
  {
	  this.Name=Name;
  }
  public String getName()
  {
	  return Name;
  }
  public Yorkshire(String Name)
  {   
      super(Name);
  }
  // overiding the "Speak" method here
  public void Speak()
  {   
      super.Speak();
  }
}
