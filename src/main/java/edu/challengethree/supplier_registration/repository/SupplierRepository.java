package edu.challengethree.supplier_registration.repository;

import edu.challengethree.supplier_registration.models.entities.Supplier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends MongoRepository<Supplier, String> {
}
