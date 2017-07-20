package com.pogochat.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pogochat.constants.UserConstants;

@Controller
@RequestMapping(UserConstants.PARENT_API_URL)
public class OpenIDController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(UserConstants.LOGIN_WITH_GOOGLE_API_URL)
	@ResponseBody
	public final String loginWithGoogleOpenId() {
		final String username = SecurityContextHolder.getContext().getAuthentication().getName();
		logger.info(username);
		return "Welcome, " + username;
	}

	@RequestMapping(UserConstants.LOGIN_WITH_FACEBOOK__API_URL)
	@ResponseBody
	public final String loginWithFacebookOpenId() {
		logger.info("Not impleted");
		return "Welcome, Not implemented";
	}
}
