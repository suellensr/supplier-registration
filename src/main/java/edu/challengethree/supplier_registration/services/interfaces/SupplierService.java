package edu.challengethree.supplier_registration.services.interfaces;

import edu.challengethree.supplier_registration.models.entities.Supplier;

import java.util.List;

public interface SupplierService {
    Supplier createSupplier(Supplier supplier); //TODO: Trocar para SupplierDTO
    Supplier updateSupplier(Supplier supplier); //TODO: Trocar para SupplierDTO
    List<Supplier> getAllSuppliers(); //TODO: Trocar para SupplierDTO
    Supplier getSupplierById(String id); //TODO: Trocar para SupplierDTO
    String deleteSupplier(String id);
}
