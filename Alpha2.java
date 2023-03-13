import java.util.*;
class Alpha2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float pencilprice = sc.nextFloat();
		float penprice = sc.nextFloat();
		float eraserprice = sc.nextFloat();
		float bill = pencilprice + penprice + eraserprice;
		System.out.println("Total cost of the items " + bill);
		 float Inc_Gstbill = bill + (0.18f * bill);
		System.out.println("Total cost of the items including GST " + Inc_Gstbill);
	}
	
}