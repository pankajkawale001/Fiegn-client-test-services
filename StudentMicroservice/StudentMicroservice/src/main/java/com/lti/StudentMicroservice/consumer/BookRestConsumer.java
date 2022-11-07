package com.lti.StudentMicroservice.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="BOOK-MICROSERVICE")
public interface BookRestConsumer {

	@GetMapping("/books/{uuid}")
	public String getBookByID(@PathVariable int uuid);
}
