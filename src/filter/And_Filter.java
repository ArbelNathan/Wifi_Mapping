package filter;

import dataBase.Networks;

public class And_Filter {
	public void  Or(Filter a,Filter b,Networks nets) {
		
		a.filter(nets);
		b.filter(nets);
	}
}