 final class Test
{
	final String name;
	final int age;
	public Test(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
	return name;
}
	public int getAge()
	{
	return age;
}

}
class Immutableclass
{
	public static void main(String[] args) {
		Test i=new Test("abc",10);
		System.out.println(i.getName());
		System.out.println(i.getAge());
	}
}