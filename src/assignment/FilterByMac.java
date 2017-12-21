package assignment;
/**
 * @author Arbel Nathan
 * @author Isabella Oren
 *
 *@category the class filters by Mac
 */
public class FilterByMac {
	
	//All_Networks nets=new All_Networks("ScanInput");
	/**
	 * @category filters the nets by the given mac
	 * @param mac
	 * @param nets
	 */
	public void filter(String mac,All_Networks nets) {
		int place=0;
		while(place<nets.size()) {
			if(!(nets.getNetworks().get(place).getMac().equals(mac))) {
				nets.getNetworks().remove(place);
				place--;
			}
			place++;
		}
		
	}
	

}
