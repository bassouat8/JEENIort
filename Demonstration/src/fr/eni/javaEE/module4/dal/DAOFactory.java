package fr.eni.javaEE.module4.dal;

public abstract class DAOFactory {
	
	public static AvisDAO getAvisDAO()
	{
		return new AvisDAOJdbcImpl();
	}
}
