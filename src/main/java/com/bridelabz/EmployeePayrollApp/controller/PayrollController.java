package com.bridelabz.EmployeePayrollApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridelabz.EmployeePayrollApp.entity.PayrollModel;
import com.bridelabz.EmployeePayrollApp.service.PayrollService;

@RestController
//@RequestMapping("/employeepayrollservice")
public class PayrollController {
	
	@Autowired
	PayrollService service ;
	
	@GetMapping("/")
	public List<PayrollModel> getEmployee() {
		return service.getAllEmp();
	}
	 
	@GetMapping("/get/{id}")
	public PayrollModel getEmployeeById(@PathVariable int id) {
		return service.getEmpById(id);
	}
	 
	@PostMapping("/create")
	public PayrollModel addEmp(@RequestBody PayrollModel data) {
		return service.addEmp(data);
	}
	
	@PutMapping("update/{id}")
	public void updateEmp(@RequestBody PayrollModel data , @PathVariable int id ) {
		service.updateEmpById(data, id);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteMessage(@PathVariable int id ) {
		service.deleteEmpById(id);
	}

}
