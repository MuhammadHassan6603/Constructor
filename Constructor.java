class Room
{
	double width;
	double height;
	double depth;
	Room()
	{
		width=10;
		height=25;
		depth=40;
	}
}
class Constructor
{
	public static void main(String args[])
	{
		Room obj=new Room();
		System.out.println(obj.width + "\t" + obj.height + "\t" + obj.depth);
	}
}