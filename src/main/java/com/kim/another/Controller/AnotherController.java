package com.kim.another.Controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 

@RestController 
@RequestMapping("another")
public class AnotherController {
	 
		/**
		 * This endpoint should be public
		 * @return
		 */
		@RequestMapping(value = "/health", method = RequestMethod.GET,  produces = "application/json")   
		public String   health(){
			System.out.println("========= health endpoint ====== =====");
			return "{\"api\":\"AnotherApp\",\"status\":\"UP\"}";
		}
		
		/**
		 * This endpoint should be private
		 * @return
		 */
		@RequestMapping(value = "/privateEndpoint", method = RequestMethod.GET,  produces = "application/json")   
		public String   privateEndpoint(){
			System.out.println("========= health endpoint ====== =====");
			return "{\"api\":\"TestApp\",\"status\":\"UP\"}";
		}
}
