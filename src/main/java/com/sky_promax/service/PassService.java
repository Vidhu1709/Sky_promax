package com.sky_promax.service;

import java.util.List;

import com.sky_promax.dto.PassDto;
import com.sky_promax.entity.Pass;

public interface PassService {
	
	public void PassSave(Pass pass);

	public List<Pass>ListSavePass(Pass pass);

	public void delelepassId(long id);
	
	public Pass updatePassDet(long id);

	public void UpdatePassengerInfo(PassDto passdto);

	

	

}
