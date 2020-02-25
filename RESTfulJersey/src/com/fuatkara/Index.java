package com.fuatkara;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//http://localhost:8080/RESTfulJersey/rest/main
@Path(value = "/main")
public class Index {
	//GET == READ
	// POST == INSERT 
	//PUT == UPDATE
	// DELETE == DELETE
	
	//http://localhost:8080/RESTfulJersey/rest/main/mainMethod
	@GET
	@Path(value = "mainMethod/method")
	public String method_1() {
		System.out.println("Method_1");
		return "Method_1";
	}
	
	//http://localhost:8080/RESTfulJersey/rest/main/method
	@GET
	@Path(value = "/method")
	@Produces(MediaType.TEXT_PLAIN) //Bu annotation bize senin uretecgin tipi soyluyor.
	//Bazen uretilcek tipide soyleyebiliriz,bazen geriye bilgi veriyoruz
	//ya tipini soyleyebiliriz.  
	
	public String method_2() {
		System.out.println("Method_2");
		return "Method_2";
	}

	//http://localhost:8080/RESTfulJersey/rest/main/htmlMethod
	@GET
	@Path(value = "/htmlMethod")
	@Produces("text/html") //Bu annotation bize senin uretecgin tipi soyluyor.
	//Bazen uretilcek tipide soyleyebiliriz,bazen geriye bilgi veriyoruz ya tipini soyleyebiliriz.  	
	public String methodd_3() {
		System.out.println("Method_3");
		return "<h1>Method_3</h1>";
	}
	
	//http://localhost:8080/RESTfulJersey/rest/main/htmlMethod/{firstMethod}
	@GET
	@Path(value = "/htmlMethod/{mParameter}")
	@Produces(MediaType.TEXT_XML)
	//Respose demek bir tip demektir, yani mesela systemi calistir,
	//200 Ok demek, 505 de hata var yani bu hatalari aldigimizda sistem
	//nasil cevap alsin gibi Ornek: 200'se OK degilde, Aferin yazsin
	
	//parametreli firstMethod,name 'e atanacak
	public Response methodd_4(@PathParam("mParameter") String mParameter) {
		System.out.println("Parameter coming from Method_3" + mParameter); 
		// Burda yukaridan gelen parametre yazilcak.
		
		String result= "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <message>" + mParameter + "<message>";
		//<message> seklini istedigin gibi yazabilirsin, <furkan> da derdin. 
		//Calistirdiginda yeni web sayfasi gelicek, <furkan>selam</furkan> yazicak ustunde
		//<?xml version=\"1.0\" encoding=\"UTF-8\"? yazicak html dosyasi gibi.
		
		
		return Response.status(200).entity(result).build();  
		//Yani status demek 200 de Ok, diyor 500 hata diyor,
		//entity yani 200 statusune varlik olustur ve 
		//build(calsitiriyor)
	}
	

}













