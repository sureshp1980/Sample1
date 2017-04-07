package com.cts;

import java.util.logging.Logger;

public class Sample1 {
	private static final Logger LOGGER = Logger.getLogger("com.cts.Sample1");
	String str2 = "ccca";
	String str3 = "ccc";

	public void mthd() {
		LOGGER.info("abc" + str3 + str2);
		LOGGER.info("abc" + str3 + str2);
		LOGGER.info("abc");
		LOGGER.info("abc");

	}

}
