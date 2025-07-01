package com.buthdev.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.buthdev.demo.dtos.ShortenUrlRequestDTO;

@RestController
public class UrlController {

	@PostMapping(value = "/shorten=url")
	public ResponseEntity<Void> shortenUrl(@RequestBody ShortenUrlRequestDTO request) {
		
		return ResponseEntity.ok().build();
	}
}