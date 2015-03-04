package com.SOR2.SHARED_SERVICES;

import javax.jws.WebService;

@WebService
public interface ChangeStudentDetails {
	Student changeName(Student student);
}
