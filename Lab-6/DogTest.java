public class DogTest
{
public static void main(String[] arg)
{
	Dog D1 = new Dog("Dog");
	System.out.println(D1.getName());
	D1.Speak();
	Labrador D2 = new Labrador("Labrador","Brown");
	System.out.println(D2.Name+ "," +D2.getColor()+ "," +D2.avgBreedWeight());
	D2.Speak();
	Yorkshire D3 = new Yorkshire("Yorkshire");
	System.out.println(D3.getName());
	D3.Speak();
}
}
