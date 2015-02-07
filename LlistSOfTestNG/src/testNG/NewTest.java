package testNG;

import listS.AList0;
import listS.AList1;
import listS.AList2;
import listS.LList1;
import listS.LList2;

import org.testng.annotations.Factory;

public class NewTest
{
	@Factory
	public Object[] createInstances()
	{
		return new Object[] { new ExListTest(new AList0()),
				new ExListTest(new AList1()), new ExListTest(new AList2()),
				new ExListTest(new LList1()), new ExListTest(new LList2()), };

	}
}
