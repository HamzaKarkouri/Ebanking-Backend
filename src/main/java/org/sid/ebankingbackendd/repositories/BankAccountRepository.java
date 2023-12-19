package org.sid.ebankingbackendd.repositories;

import org.sid.ebankingbackendd.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
