package com.SOR2.SHARED_SERVICES;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Consumes("application/json")
@Produces("application/json")
@WebService(endpointInterface = "com.SOR2.SHARED_SERVICES.ChangeStudentDetails")
public class ChangeStudentDetailsImpl implements ChangeStudentDetails {

	@POST
	@Path("/changeName")
	@Override
	public Student changeName(Student student) {
		student.setName("Hello " + student.getName());
		return student;
	}

}
