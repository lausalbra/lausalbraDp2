package acme.features.inventor.patronage;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import acme.entities.patronages.Patronage;
import acme.framework.controllers.AbstractController;
import acme.roles.Inventor;

@Controller
public class InventorPatronageController extends AbstractController<Inventor, Patronage>{
	
	  @Autowired
	  protected InventorPatronageListMineService    listMineService;
	  
	  @PostConstruct
	  protected void initialise() {
	        super.addCommand("list-mine", "list", this.listMineService);
	    }

}
