package com.fis.amm.validation.rest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	
	String[] HEADERS = { "CUSTOMER ID", "WRITER NAME", "BRANCH", "PRODUCT ID", "CMP PRICE", "PRICE CATEGORY",
			"NEW PRICE", "MATRIX ID", "DATE CREATED", "EXPIRATION DATA" }; // this String array will change as enum later
	String FILE_PATH = ""; // desired file path based on the requirement

	@PostMapping(value="/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> generateCustomerReport( @RequestBody Customer customer) {
		
		try (CSVPrinter printer = new CSVPrinter(new FileWriter(FILE_PATH+"customer.csv"), CSVFormat.EXCEL.withHeader(HEADERS))) {
			List<Object[]> customerData = getCustomerObjectData(customer);
			if(Optional.ofNullable(customerData).isPresent() && !customerData.isEmpty()) {
				printer.printRecords(customerData);
				printer.flush();
			}
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok("Success");
	}
	
	/*
	 * This private method will move to services in future and as of now single customer data handling if required it can handle list of customers
	 */
	private List<Object[]> getCustomerObjectData(Customer customer){
		List<Object[]> customerData = new ArrayList<>();
		if(Optional.ofNullable(customer).isPresent()) {
			customerData.add(new Object[] {customer.getCustomerId(), customer.getWriterName(), customer.getBranch(), customer.getProductId(), 
					customer.getCmpPrice(), customer.getPriceCategory(), customer.getNewPrice(),customer.getMatrixId(), 
					customer.getDateCreated(), customer.getExprirationDate()});
		}
		return customerData;
	}
}
