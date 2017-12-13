package filter;

import assignment.All_Networks;
/**
 * 
 * @author Isabella Oren
 * @author Arbel Nathan
 *
 * @category The class Filter_By_ID filters the data we received by the ID wanted.
 */
public class Filter_By_ID {
	/**
	 * @author Isabella Oren
	 * @author Arbel Nathan
	 * 
	 * @category This function filters the data we have in nets by the ID we receive.
	 * 
	 * @param ID
	 * @param nets
	 * 
	 */
	public void filter(String ID,All_Networks nets) {
		int place=0;
		while(place<nets.size()) {
			if(!(nets.getNetworks().get(place).getId().equals(ID))) {
				nets.getNetworks().remove(place);
				place--;
			}
			place++;
		}
		
	}
	
	
}