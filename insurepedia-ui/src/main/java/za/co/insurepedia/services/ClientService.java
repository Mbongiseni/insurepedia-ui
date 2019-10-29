package za.co.insurepedia.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import za.co.insurepedia.models.Client;

@Service
public class ClientService {
private static final Logger LOGGER = Logger.getLogger(Client.class);
	
	private static List<Client> clients = new ArrayList<Client>();
	private static int clientcount= 3;
	
	static {
		clients.add(new Client(1, "Mr", "WM", "Mbongiseni","Willmont", "Ngubane", "1234567890123", new Date()));
		clients.add(new Client(2, "Mr", "HM", "Mxolisi","Howard", "Ngubane", "1234567890123", new Date()));
		clients.add(new Client(3, "Mrs", "KQ", "Khanyisile","Queen", "Ngubane", "1234567890123", new Date()));
	}

	public List<Client> retrieveClientsList() {
		return clients;
	}

	public void addClient(String title, String initials, String firstName, String middleName, String lastName, String idNumber, Date dateOfBirth) {
		clients.add(new Client(++clientcount, title, initials, firstName, middleName, lastName, idNumber, dateOfBirth));
	}
	
	public void addClient(Client client) {
		clients.add(client);
	}

	public void deleteClient(int id) {
		Iterator<Client> itorator = clients.iterator();
		while(itorator.hasNext()) {
			Client client = itorator.next();
			if (client.getClientId() == id)
				clients.remove(client);
		}
	}
	
	public void deleteClient(Client client) {
		clients.remove(client);
	}
	
	public Client retrieveClient(int id) {
		for (Client client: clients) {
			if(client.getClientId() == id)
				return client;
		}
		return null;
	}
	
	public void udpateClient(Client client) {
		clients.remove(client);
		clients.add(client);
	}
}
