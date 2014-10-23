package com.awoo.wedding.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.awoo.wedding.util.Constants;
import com.awoo.wedding.util.LogUtil;

public class GeneralFilter implements Filter
{
	public void init(FilterConfig filterConfig) throws ServletException
	{
		
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse response,
			FilterChain chain) throws IOException, ServletException
	{
		String userName = Constants.DEFAULT_USER_NAME;
		HttpServletRequest request = (HttpServletRequest) servletRequest;
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
		
		chain.doFilter(request, response);
	}

	public void destroy() {}
}
