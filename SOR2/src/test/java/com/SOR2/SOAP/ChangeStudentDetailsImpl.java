package com.SOR2.SOAP;

import javax.jws.WebService;

@WebService(endpointInterface = "com.SOR2.SOAP.ChangeStudentDetails")
public class ChangeStudentDetailsImpl implements ChangeStudentDetails {

	@Override
	public Student changeName(Student student) {
		student.setName("Hello " + student.getName());
		return student;
	}

}
