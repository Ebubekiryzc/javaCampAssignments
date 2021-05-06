package reCapDemo.adapters;

import java.rmi.RemoteException;

import reCapDemo.abstracts.CustomerCheckService;
import reCapDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), customer.getFirstName(),
					customer.getLastname(), customer.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}

}
