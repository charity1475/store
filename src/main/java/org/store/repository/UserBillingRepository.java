package org.store.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.store.domain.UserBilling;

public interface UserBillingRepository extends JpaRepository<UserBilling, Long> {
}
