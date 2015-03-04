package com.SOR2.SOAP;

import javax.jws.WebService;

@WebService
public interface ChangeStudentDetails {
	Student changeName(Student student);
}
