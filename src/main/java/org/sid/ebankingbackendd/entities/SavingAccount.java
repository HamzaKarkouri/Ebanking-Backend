package org.sid.ebankingbackendd.entities;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("SA")
@Entity
public class SavingAccount extends BankAccount{
    private double interestRate;
}
