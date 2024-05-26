package ma.enset.digitalbankingproject.repositories;


import ma.enset.digitalbankingproject.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}