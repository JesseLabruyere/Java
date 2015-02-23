package com.SOR2.REST;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
@Path("/Student")
public class ChangeStudentDetailsImpl implements ChangeStudentDetails{
	
	@POST
	@Path("/changeName")
	@Produces(MediaType.APPLICATION_XML)
	public Student changeName(Student student) {
		student.setName("HELLO " + student.getName());
		 return student;
	}
	
	@GET
	@Path("/getName")
	@Produces(MediaType.APPLICATION_XML)
	public Student getName() {
	    Student student = new Student();
	    student.setName("Rockey"); 
	    return student /*type(MediaType.APPLICATION_JSON)*/;
	}
	
	@GET
	@Path("/getStudent")
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent() {
	    Student student = new Student();
	    student.setName("Rockey"); 
	    student.setLastName("Williams"); 
	    student.setAge(32); 
	    return student;
	}

}
