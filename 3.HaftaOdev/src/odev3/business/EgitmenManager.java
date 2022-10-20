package odev3.business;

import java.util.logging.Logger;

import odev3.dataAccess.EgitmenDao;
import odev3.entities.Egitmen;

public class EgitmenManager {
	
	private EgitmenDao egitmenDao;
	private Logger[] loggers;
	
	
	public EgitmenManager(EgitmenDao egitmenDao, Logger[] loggers) {
		
		this.egitmenDao = egitmenDao;
		this.loggers = loggers;
	}
	public void add(Egitmen egitmen) {
		egitmenDao.add(egitmen);
		
		for(Logger logger : loggers) {
			logger.log(egitmen.getEgitmenAdı());
		}	
	}
	
}
