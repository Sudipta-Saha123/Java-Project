package interfaces;


import java.lang.*;
import classes.*;

public interface ProductItemOperations
{
	boolean insertProduct(Product p);
	boolean removeProduct(Product p);
	Product searchProduct(String barcode);
	void showAllProduct( );
}