package com.sky_promax.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky_promax.dto.PassDto;
import com.sky_promax.entity.Pass;
import com.sky_promax.repository.PassRepository;
@Service
public class PassServiceImpl implements PassService {
	
	@Autowired
	private PassRepository passrepo;

	@Override
	public void PassSave(Pass pass) {
		passrepo.save(pass);

	}

	@Override
	public List<Pass>ListSavePass(Pass pass) {
		List<Pass>passdata= passrepo.findAll();
		return passdata;
	}

	@Override
	public void delelepassId(long id) {
         passrepo.deleteById(id);		
	}



	@Override
	public Pass updatePassDet(long id) {
		Optional<Pass> findById = passrepo.findById(id);
		Pass passde= findById.get();
	   return passde;
	}

	@Override
	public void UpdatePassengerInfo(PassDto passdto) {
	    Pass pass= new Pass();
	    pass.setId(passdto.getId());
	    pass.setFname(passdto.getFname());
	    pass.setLname(passdto.getLname());
	    pass.setEmail(passdto.getEmail());
	    pass.setMobile(passdto.getMobile());
	    pass.setDepair(passdto.getDepair());
	    pass.setArrair(passdto.getArrair());
	   Pass updatepas= passrepo.save(pass);
		
	}

	

}
