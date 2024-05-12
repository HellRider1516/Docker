package in.mahesh.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> msg(){
		return new ResponseEntity<String>("Vachidi Ah...........", HttpStatus.OK);
	}

}
