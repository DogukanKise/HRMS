package hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstracts.jobTitleService;
import hrms.hrms.entities.concretes.jobTitle;

@RestController
@RequestMapping("/api/jobController")
public class jobTitlesController {
	
	private jobTitleService _jobTitleService;
	
	public jobTitlesController() {
		
	}
	
	@Autowired
	public jobTitlesController(jobTitleService jobTitleService) {
		this._jobTitleService=jobTitleService;
	}
	
	@GetMapping("/getAll")
	public List<jobTitle> getAll(){
		return this._jobTitleService.getAll();
	}
}
