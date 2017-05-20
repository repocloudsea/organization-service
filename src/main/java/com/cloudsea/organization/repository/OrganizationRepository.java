package com.cloudsea.organization.repository;

import org.springframework.context.annotation.Import;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cloudsea.commons.config.CloudSeaMongoConfiguration;
import com.cloudsea.organization.model.Organization;

@RepositoryRestResource
@Import(value = { CloudSeaMongoConfiguration.class })
public interface OrganizationRepository extends PagingAndSortingRepository<Organization, String> {

	Organization findByOrgId(String orgId);
}
