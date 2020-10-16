/**
 * 
 */
package hr.a1.dg.apiservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hr.a1.dg.apiservice.domain.Status;

/**
 * @author grubi
 *
 */
@RestController
public class StatusController {
	
	@GetMapping("/")
	public String hello() {
		return "Hello from API service!";
	}
	
	@GetMapping("/status")
	public Status getStatus() {
		
		Status status = new Status();
		status.setId(200);
		status.setInfo("OK.");
		
		return status;
	}
	
}
