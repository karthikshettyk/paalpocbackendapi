package com.paalpocbackend.app.repository;
import com.paalpocbackend.app.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel,Integer> {

}