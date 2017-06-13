package com.greglturnquist.payroll;


import org.springframework.data.repository.CrudRepository;

public interface TicketsRepository extends CrudRepository<Ticket, Long>{
}
