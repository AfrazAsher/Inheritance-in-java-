public class Dog
{
  protected String Name;
  public void setName(String Name)
  {
	  this.Name=Name;
  }
  public String getName()
  {
	  return Name;
  }
  public Dog(String Name)
  {
	  this.Name=Name;
  }
  public void Speak()
  {   
	  System.out.println("Woof");
  }

}
