package com.cloudsea.organization.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cloudsea.organization.model.Organization;
import com.cloudsea.organization.repository.OrganizationRepository;

@RestController
public class SearchController {

	@Autowired
	private OrganizationRepository organizationRepository;

	public SearchController(OrganizationRepository organizationRepository) {
		this.organizationRepository = organizationRepository;
	}

	@GetMapping("/findById/{orgId}")
	public ResponseEntity<String> findById(@PathVariable String orgId) {
		Organization org = organizationRepository.findByOrgId(orgId);

		if (org == null) {
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
		}
		String id = org.getOrgId();

		if (StringUtils.isBlank(id))
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);

		return new ResponseEntity<String>("orgId=" + id, HttpStatus.OK);
	}
}
