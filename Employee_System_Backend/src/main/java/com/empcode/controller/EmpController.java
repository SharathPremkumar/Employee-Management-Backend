package com.empcode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.empcode.model.Emp;
import com.empcode.repository.EmpRepository;
import com.empcode.service.EmpService;


@Controller
@RequestMapping("/api/v1")
@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@Autowired
	private EmpRepository empRepo;

	@PostMapping("/save")
	public ResponseEntity<Emp> createEmp(@RequestBody Emp emp) {
		return new ResponseEntity<Emp>(empService.createEmp(emp), HttpStatus.CREATED);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Emp>> getAllEmp() {
		return new ResponseEntity<List<Emp>>(empService.getAllEmp(),HttpStatus.OK);
	}
	
	@GetMapping("/list/designation")
	public ResponseEntity<List<Emp>> getEmpByDesignation(@RequestParam String designation) {
		return new ResponseEntity<List<Emp>>(empRepo.findByDesignation(designation),HttpStatus.OK);
	}
	
	@GetMapping("/list/salary")
	public ResponseEntity<List<Emp>> getEmpBySalary(@RequestParam String salary) {
		return new ResponseEntity<List<Emp>>(empRepo.findBySalary(salary),HttpStatus.OK);
	}
	
	@GetMapping("/list/address")
	public ResponseEntity<List<Emp>> getEmpByAddress(@RequestParam String address) {
		return new ResponseEntity<List<Emp>>(empRepo.findByAddress(address),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Emp> getEmpById(@PathVariable int id) {
		if(empService.getEmpById(id) == null) {
			
		}
		return new ResponseEntity<Emp>(empService.getEmpById(id), HttpStatus.OK);
	}
		
	@GetMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable int id) {

		empService.deleteEmp(id);
		return new ResponseEntity<String>("Delete Sucessfully", HttpStatus.OK);
	}

	@GetMapping("/update/{id}")
	public ResponseEntity<String> updateEmp(@PathVariable int id, @RequestBody Emp emp) {
		
		empService.updateEmp(id, emp);
		return new ResponseEntity<String>("updated Sucessfully", HttpStatus.OK);
	}
}
