package za.co.insurepedia.controllers;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import za.co.insurepedia.models.Client;
import za.co.insurepedia.services.ClientService;

@Controller
public class ClientController {
	private static final Logger LOGGER = Logger.getLogger(ClientController.class);
	
	@Autowired
	ClientService service;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, false));
	}
	
	@RequestMapping(value="/client-details", method = RequestMethod.GET)
	public String showClientDetailsPage(ModelMap model) {
		model.addAttribute("client", new Client());
		return "client-details";
	}
	
	@RequestMapping(value="/client-details", method = RequestMethod.POST)
	public String addClientDetails(ModelMap model, @Valid Client client, BindingResult bindigResult) {
		if (bindigResult.hasErrors()) {
			return "/client-details";
		}
		service.addClient(client);
		return "redirect:clients-list";
	}
	
	@RequestMapping(value="/clients-list", method = RequestMethod.GET)
	public String showClientsList(ModelMap model) {
		model.addAttribute("clientList", service.retrieveClientsList());
		return "clients-list";
	}
	
	@RequestMapping(value = "/delete-client", method = RequestMethod.GET)
	public String removeClientDetails(@RequestParam String clientId) {
		Client client = service.retrieveClient(Integer.valueOf(clientId));
		service.deleteClient(client);
		return "redirect:clients-list";
	}
	
	@RequestMapping(value = "/update-client", method = RequestMethod.GET)
	public String updateClientDetails(ModelMap model, @RequestParam String clientId) {
		Client client = service.retrieveClient(Integer.valueOf(clientId));
		model.addAttribute("client", client);
		return "client-details";
	}
	
	@RequestMapping(value = "/update-client", method = RequestMethod.POST)
	public String createClientDetails(ModelMap model, @Valid Client client, BindingResult bindigResult) {
		if (bindigResult.hasErrors()) {
			return "/client-details";
		}
		//model.addAttribute("client", service.udpateClient(client));
		return "redirect:client-details";
	}
}
