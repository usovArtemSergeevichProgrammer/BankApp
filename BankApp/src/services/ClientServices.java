package services;

import model.Client;
import services.exceptions.ClientOperationException;
import services.exceptions.Statuses;

public class ClientServices {
	/**
	 * 
	 * @param c
	 *            - the bank Client
	 * @throws ClientOperationException
	 *             - in case of invalid client
	 */
	public static void info(Client c) throws ClientOperationException {

		if (c != null && (c.getUid() <= 0 || c.getName() == null || c.getLastName() == null)) {
			throw new ClientOperationException("Invalide client data", Statuses.INVALID_CLIENT);
		}
		

		try {
			c.getClass();// NullPointerException can be throw
		} catch (Exception e) {// add Nested Exception
			// TODO: handle exception
			throw new ClientOperationException("Invalide client data", e, Statuses.INVALID_CLIENT);

		}
		System.out.println("------------------------");
		System.out.println(c);

	}

}
