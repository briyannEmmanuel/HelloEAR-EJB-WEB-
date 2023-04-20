package com.groupeisi.metier;

import javax.ejb.Stateless;

@Stateless

public class HelloImpl implements IHello  {

	@Override
	public String message() {
		
		return "Bienvenue dans JEE avec EJB Session !!";
	}

}
