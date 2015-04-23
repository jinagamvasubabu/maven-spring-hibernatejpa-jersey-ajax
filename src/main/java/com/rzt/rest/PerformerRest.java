/**
 * 
 */
package com.rzt.rest;

import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rzt.contextVariables.ContextVariables;
import com.rzt.human.Domain.Human;
import com.rzt.human.dao.interfaces.HumanDao;
import com.rzt.models.Employee;

/**
 * @author vasu
 *
 */
@Component
@Path("/hello")
public class PerformerRest extends ContextVariables{

	@Autowired
	HumanDao humanDao;
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		HttpSession session = getSerRequest().getSession();
		System.out.println("in server:"+session.getId());
		
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	
	@GET
	@Path("/getHumans")
	public Response getHumans() {
		/*ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");*/
		
		Human h = new Human();
		h.setHumanId(1);
		h.setName("vasusdfsdf");
		h.setAadhar("234324");
		
	///Human h1 = ((HumanDao) context.getBean("HumanDao")).findByStockCode(h);//id.getId());
		Human h1 = humanDao.findByStockCode(h);
		Human h2 = new Human();
		h2.setHumanId(7);
		h2.setName("sad");
		h2.setAadhar("asd");
		humanDao.save(h2);
		
		System.out.println(h1.toString());
		//humanDao.findByStockCode(h);
		//humanDao.save(h);
		return Response.status(200).entity(h1.toString()).build();
	}
	
	@POST
	@Path("/postman")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createEmployeeInJSON(Employee e) {
 
		System.out.println("Got Employee:"+e.toString());
		String result = "Employee saved : " + e;
		return Response.status(201).entity(result).build();
 
	}
 
}
