class T implements Runnable
{ 
	Thread t;
	String name;
	int time;
	T(String nm,int tm)
	{
		name = nm;
		time = tm;
		t=new Thread(this, nm);
	}
   public void run()
   {
	   try
	   {
		   for(int n=10;n>0;n--)
		   {
			 System.out.println(name);
			 Thread.sleep(time);
		   }
	   }
	   catch(InterruptedException ie)
	   {
		   System.out.println(" Interruption Occur");
	   }
	   
   }
}

class ttThread
{
	public static void main(String ss[])
	{
		T bms=new T("BMS College of Engineering",10000);
		T cse=new T("CSE",2000);
		bms.t.start();
		cse.t.start();
	}
}
