package code.microsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import code.microsystem.entity.Customer;

@Repository
public interface CustmerRepository extends JpaRepository<Customer, Long> {

}
