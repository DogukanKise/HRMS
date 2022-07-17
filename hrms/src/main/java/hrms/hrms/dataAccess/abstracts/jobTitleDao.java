package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.jobTitle;

public interface jobTitleDao extends JpaRepository<jobTitle, Integer> {
	
	
}
