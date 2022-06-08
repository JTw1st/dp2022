package lab5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import lab5.danimals.danimals;

@RepositoryRestResource
@CrossOrigin(origins = "*")
// @RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface danimalsRepository extends JpaRepository<danimals, Integer> {

//  List<danimals> findByLastName(@Param("name") String name);

}