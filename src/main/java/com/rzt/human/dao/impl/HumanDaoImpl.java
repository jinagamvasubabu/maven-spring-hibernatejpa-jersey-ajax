/**
 * 
 */
package com.rzt.human.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rzt.EntityManagerFactory.CustomEntityManagerFactory;
import com.rzt.human.Domain.Human;
import com.rzt.human.dao.interfaces.HumanDao;

/**
 * @author vasu
 *
 */
@Component
@Transactional(readOnly = false, rollbackFor = Exception.class,propagation= Propagation.REQUIRED)
public class HumanDaoImpl extends CustomEntityManagerFactory implements HumanDao{

	
	@Override
	public void save(Human hum) {
		getEntm().persist(hum);
		//getEntm().getTransaction().commit();
	}

	@Override
	public void update(Human hum) {
		getEntm().merge(hum);
	}

	@Override
	public void delete(Human hum) {
		getEntm().remove(hum);
	}

	@Override
	public Human findByStockCode(Human hum) {
		System.out.println("i am in call ");
		return getEntm().find(Human.class, hum.getHumanId());
		//return "Hi HEllo";
	}

}
