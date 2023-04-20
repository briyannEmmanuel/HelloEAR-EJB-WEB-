package com.groupeisi.metier;

import javax.ejb.Local;

@Local

public interface IHello {

	public String message();
}
