package com.spring.angular.xfs;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/myservice")
public class XfsController {  
	
	private final XfsRepository xfsRepository; 
	
	public XfsController(XfsRepository xfsRepository ) {
		this.xfsRepository=xfsRepository;
	}

	@RequestMapping(
		    value = "/postKSR", 
		    method = RequestMethod.POST)
		public void alert(@RequestBody Map<String, Object> payload,
				@ModelAttribute("xfs") @Valid Xfs xfs,BindingResult result, Model model ) 
		    throws Exception {

		  System.out.println(payload);
		  xfsRepository.save(xfs);
    }

	
	  @GetMapping(value = "/hello")
	   public String hello() {
	      
	     // String uri ="https://api.github.com/repos/Sudipa22/Project/commits";
	      String URL = "https://api.github.com/repos/papun12345/reactfinal/commits";
	      System.out.println(URL);
	      RestTemplate restTemplate = new RestTemplate();
	      String result = restTemplate.getForObject(URL, String.class);
	      
	      String arr[] = result.split(":");
	      System.out.println(arr.length);
		/*
		 * for (int i = 0; i < arr.length; i++) {
		 * System.out.println(arr[i]+"----------------"+i ); }
		 */
	      String str=arr[5];
	      String arr2[] = str.split(",");
			System.out.println(arr2[0]);
		
		/*
		 * JsonParser springParser = JsonParserFactory.getJsonParser(); Map<String,
		 * Object> map = springParser.parseMap(result);
		 */
	      //String arrayList[] = new String[result.size()];
	     // System.out.println(mapArray.length);
	      //System.out.println("Items found: " + mapArray.length);
     //   return mapArray[0];
	     // System.out.println(result);
	      return arr2[0];
	   	  	}

}
