package com.pramit.spring.dba.dao;

import java.util.List;

import com.pramit.spring.dba.model.CombinedObject;

public interface CombinedObjectDAO {
	
	List<CombinedObject> getAllCombination();
	List<CombinedObject> getAllCombinationBasedOnSalary(int salary);

}
