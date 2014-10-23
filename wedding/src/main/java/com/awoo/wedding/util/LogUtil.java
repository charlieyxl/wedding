package com.awoo.wedding.util;

import org.slf4j.MDC;

public final class LogUtil
{
	public static void configLogParameters(String username)
	{
		MDC.put(Constants.USER_NAME, username);
	}
}
