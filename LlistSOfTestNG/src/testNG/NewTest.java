package testNG;

import listS.AList0;
import listS.AList1;
import listS.AList2;
import listS.ExList;
import listS.LList1;
import listS.LList2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class NewTest
{
	@DataProvider
	public Object[][] tablesData()
	{
		return new Object[][] { { new AList0() }, { new AList1() },
				{ new AList2() }, { new LList1() }, { new LList2() }, };
	}

	@Factory(dataProvider = "tablesData")
	public Object[] createInstances(ExList list)
	{
		return new Object[] { new ExListTest(list) };
	}
}
