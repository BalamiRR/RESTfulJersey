package com.fuatkara;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


//http://localhost:8080/RESTfulJersey/rest/selam
@Path(value = "/selam")
public class Index {
	
	//GET == READ
	// POST == INSERT 
	//PUT == UPDATE
	// DELETE == DELETE
	
	
	@GET
	public String methodd() {
		System.out.println("Method_1");
		return "Jersey_1";
	}
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN) //Bu annotation bize senin uretecgin tipi soyluyor.
	//Bazen uretilcek tipide soyleyebiliriz,bazen geriye bilgi veriyoruz ya tipini soyleyebiliriz.  
	public String methodd_2() {
		System.out.println("Method_2");
		return "Jersey_2";
	}
}