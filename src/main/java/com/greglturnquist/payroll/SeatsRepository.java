package com.greglturnquist.payroll;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by bartek on 14.06.17.
 */
public interface SeatsRepository extends CrudRepository<Seat, Long> {
}
