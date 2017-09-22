package com.vnext.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

	@Value("${baseConfigUrl}")
	private String baseConfigUrl;
	
	@GetMapping("/baseConfigUrl")
	public String getProfile() {
		return this.baseConfigUrl;
	}
}
