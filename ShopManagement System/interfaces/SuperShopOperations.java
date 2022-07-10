package interfaces;


import java.lang.*;
import classes.*;

public interface SuperShopOperations
{
	boolean insertSuperShop(SuperShop s);
	boolean removeSuperShop(SuperShop s);
	SuperShop searchSuperShop(String supershop);
	void showAllSuperShops();
}