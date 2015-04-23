/**
 * 
 */
package com.rzt.human.dao.interfaces;

import com.rzt.human.Domain.Human;



/**
 * @author vasu
 *
 */
public interface HumanDao {

	void save(Human hum);
	
	void update(Human hum);
	
	void delete(Human hum);
	
	Human findByStockCode(Human hum);
	
}
