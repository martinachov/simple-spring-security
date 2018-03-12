package ar.com.spring.jwt.authenticator.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1")
public class AccountController {

	@RequestMapping(value="public/{accountNumber}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getPublicAccountData(@PathVariable final int accountNumber) {
		return ("Public account number: " + accountNumber);
	}
	
	@RequestMapping(value="private/{accountNumber}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getPrivateAccountData(@PathVariable final int accountNumber) {
		return ("Private account number: " + accountNumber);
	}
	
	@RequestMapping(value="private/admin/{accountNumber}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getPrivateAdminAccountData(@PathVariable final int accountNumber) {
		return ("Private admin account number: " + accountNumber);
	}
	
}
