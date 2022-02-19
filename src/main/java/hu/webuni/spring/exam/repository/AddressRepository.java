package hu.webuni.spring.exam.repository;

import hu.webuni.spring.exam.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
    //
}
