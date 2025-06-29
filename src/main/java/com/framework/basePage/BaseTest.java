package com.framework.basePage;

import org.testng.annotations.BeforeMethod;
import static com.framework.basePage.BasepageKeywords.*;

public class BaseTest {
	
	@BeforeMethod
	public void browserActions() throws Exception {

		browserLaunch("chrome");
		launchURL(
				"https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=CjwKCAjw56DBBhAkEiwAaFsG-oxPAtdPKFcXrmO-vnFU_2PyOxM2UEmrsuwZo-xx7vVQ2qg8_piJCxoCuSQQAvD_BwE&gad_source=1&gad_campaignid=88884643&gbraid=0AAAAADu9zM0j2maJe8ZTYepfuRtXonjwU&gclid=CjwKCAjw56DBBhAkEiwAaFsG-oxPAtdPKFcXrmO-vnFU_2PyOxM2UEmrsuwZo-xx7vVQ2qg8_piJCxoCuSQQAvD_BwE");
		maximize();
	}
}
