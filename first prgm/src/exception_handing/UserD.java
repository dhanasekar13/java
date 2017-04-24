package exception_handing;

class UserD extends Exception
{
	UserD()
	{
		super();
	}
	UserD(String Msg)
	{
		super(Msg);
	}
}
class UserDUN extends RuntimeException
{
	UserDUN()
	{
		super();
	}
	UserDUN(String Msg)
	{
		super(Msg);
	}
}