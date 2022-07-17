package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.jobTitleService;
import hrms.hrms.dataAccess.abstracts.jobTitleDao;
import hrms.hrms.entities.concretes.jobTitle;


@Service
public class jobTitleManager implements jobTitleService {
	
	private jobTitleDao _jobTitleDao;
	
	public jobTitleManager() {
		
	}
	
	@Autowired
	public jobTitleManager(jobTitleDao jobTitleDao) {
		super();
		this._jobTitleDao=jobTitleDao;
	}
	
	
	@Override
	public List<jobTitle> getAll() {
		// TODO Auto-generated method stub
		return this._jobTitleDao.findAll();
	}

}
