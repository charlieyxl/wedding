package com.awoo.wedding.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.awoo.wedding.util.Constants;
import com.awoo.wedding.util.LogUtil;

public class GeneralFilter implements Filter
{
	public void init(FilterConfig filterConfig) throws ServletException
	{
		
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain chain) throws IOException, ServletException
	{
		String userName = Constants.DEFAULT_USER_NAME;
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		HttpSession session = request.getSession();
		
		if (session != null)
		{
			String sessionUserName = (String) session.getAttribute(Constants.USER_NAME);
			
			if (StringUtils.isNotBlank(sessionUserName))
			{
				userName = sessionUserName;
			}
		}
		
		LogUtil.configLogParameters(userName);
		
		try
		{
			chain.doFilter(request, response);
		}
		catch (Throwable e)
		{
			if (!response.isCommitted())
			{
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, Constants.INTERNAL_SERVER_ERROR);
			}
		}
		finally
		{
			LogUtil.clearLogParameters();
		}
	}

	public void destroy() {}
}
