package rezeptbuch.api;

import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class Recipe {
	
	public Recipe() {
		
	}
	
	//All recipes
	@GetMapping(path = "/recipe/_all", produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONObject _all() {
		return new JSONObject();
	}
	
	//A specific recipe
	@GetMapping(path = "/recipe/{ID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONObject get_id() {
		return new JSONObject();
	}
	
	@PostMapping(path = "/recipe/{ID}", consumes =  MediaType.TEXT_PLAIN_VALUE)
	public void post_id(String data) {
		
	}
	
	@DeleteMapping(path = "/recipe/{ID}")
	public void delete_id() {
		
	}
	
	//A specific recipe's title
	@GetMapping(path = "/recipe/{ID}/title", produces = MediaType.TEXT_PLAIN_VALUE)
	public String get_title() {
		return new String();
	}
	
	@DeleteMapping(path = "/recipe/{ID}/title")
	public void delete_title() {
		
	}
	
	@PutMapping(path = "/recipe/{ID}/title", consumes = MediaType.TEXT_PLAIN_VALUE)
	public JSONObject put_title(String data) {
		return new JSONObject();
	}
	
	//A specific recipe's ingredients
	@GetMapping(path = "/recipe/{ID}/ingredients", produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONObject get_ingredient() {
		return new JSONObject();
	}
	
	@DeleteMapping(path = "/recipe/{ID}/ingredients")
	public void delete_ingredient() {
		
	}
		
	@PutMapping(path = "/recipe/{ID}/ingredients", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void put_ingredient(JSONObject data) {
		
	}
	
	//A specific recipe's preparation
	@GetMapping(path = "/recipe/{ID}/preparation", produces = MediaType.TEXT_PLAIN_VALUE)
	public String get_preparatio() {
		return new String();
	}
	
	@DeleteMapping(path = "/recipe/{ID}/preparation")
	public void delete_preparation() {
		
	}
			
	@PutMapping(path = "/recipe/{ID}/preparation", consumes = MediaType.TEXT_PLAIN_VALUE)
	public void put_preparation(String data) {
		
	}
		
	//A specific recipe's categories
	@GetMapping(path = "/recipe/{ID}/categories", produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONObject get_categories() {
		return new JSONObject();
	}
		
	@DeleteMapping(path = "/recipe/{ID}/categories/{CID}")
	public void delete_categories() {
		
	}
			
	@PutMapping(path = "/recipe/{ID}/{CID}", consumes = MediaType.TEXT_PLAIN_VALUE)
	public void put_categories(String data) {
		
	}
	
	//A specific recipe's additions
	@GetMapping(path = "/recipe/{ID}/addition/_all", produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONObject get_additions() {
		return new JSONObject();
	}
	
	@GetMapping(path = "/recipe/{ID}/addition/{AID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONObject get_addition() {
		return new JSONObject();
	}
		
	@DeleteMapping(path = "/recipe/{ID}/addition/{AID}")
	public void delete_additions() {
	
	}
			
	@PutMapping(path = "/recipe/{ID}/{CID}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void put_additions(JSONObject data) {
		
	}
	
	@PutMapping(path = "/recipe/{ID}/{CID}", consumes = MediaType.TEXT_PLAIN_VALUE)
	public void put_addition_owner(String data) {
		
	}
	
	@PutMapping(path = "/recipe/{ID}/{CID}", consumes = MediaType.TEXT_PLAIN_VALUE)
	public void put_addition_state(String data) {
		
	}
	
	
}
