
package acme.features.inventor.patronageReport;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.patronages.PatronageReport;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface InventorPatronageReportRepository extends AbstractRepository {

	@Query("select pr from PatronageReport pr where pr.patronage.inventor.userAccount.username = :username")
	Collection<PatronageReport> findMinePatronagesReports(String username);

	@Query("select pr from PatronageReport pr where pr.id = :id")
	PatronageReport findOnePatronageReport(int id);

}
