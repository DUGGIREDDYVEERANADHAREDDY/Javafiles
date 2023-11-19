package veera;
abstract class person
{
	abstract void print();
}
class employee extends person
{
	void print()
	{
		System.out.print("veera");
	}
}
class Pairs
{
public static void main(String args[])
{
	employee emp= new employee();
	emp.print();
}
}