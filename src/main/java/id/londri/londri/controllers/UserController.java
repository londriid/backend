package id.londri.londri.controllers;

import id.londri.londri.models.User;
import id.londri.londri.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;

	// create
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String create(@RequestBody User user) throws Exception {
		userRepository.save(user);
		return "success";
	}

	// read
	@RequestMapping(value = "/{id}")
	public User read(@PathVariable String id) {
		return userRepository.findOne(id);
	}

	// update
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody User user) {
		userRepository.save(user);
		userRepository.findOneByNickName("name01");
	}

	// delete
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		userRepository.delete(id);
	}

}
