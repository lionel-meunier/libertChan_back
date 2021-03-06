package kaboni.libertchan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kaboni.libertchan.models.BannedUser;

import kaboni.libertchan.service.BannedUserService;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/users/banned")
public class BannedUserController {

	@Autowired
	private BannedUserService service;
	
	
	@PreAuthorize("hasAuthority('READ_IP')")
	@RequestMapping(method = RequestMethod.GET)
	public List<BannedUser> findAll(){
		return service.findAll();
	}

	
	@PreAuthorize("hasAuthority('SELECT_IP')")
	@GetMapping("/ip/{ip}")
	public BannedUser findByIp(@PathVariable String ip) {
		return service.findByIp(ip).orElse(null);
	}

	@GetMapping("/{id}/")
	public BannedUser findById(@PathVariable Long id) {
		return service.findById(id).orElse(null);
	}

}
