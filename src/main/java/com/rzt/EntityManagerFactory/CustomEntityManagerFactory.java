/**
 * 
 */
package com.rzt.EntityManagerFactory;

/**
 * @author vasu
 *
 */

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

public class CustomEntityManagerFactory {
	@PersistenceContext
	private EntityManager entm;

	public EntityManager getEntm() {
		return entm;
	}

	public void setEntm(EntityManager entm) {
		this.entm = entm;
	}
	public void closeEntm(){
		entm.close();
	}
	public void flushEntm(){
		entm.flush();
	}
	
}
