package genericUtility;

import java.io.IOException;

import org.testng.ITestResult;

public class Listernersutility extends BaseClass implements ITestListerner {
	@override
	public void onTestFailure(ITestResult result) {
		try {
			wUtil.getPhoto(driver);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
