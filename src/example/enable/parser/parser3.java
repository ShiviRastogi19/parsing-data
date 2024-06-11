package example.enable.parser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class parser3 {

	public static void main(String[] args) {
		//3.4
		String rnc_dn = "PLMN-PLMN/RNC-4";
		String active = "ZAAP:WBTS,3454;";
		
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		cal.add(Calendar.DATE, -1);
		String prevDate = dateFormat.format(cal.getTime());
		String history = "ZAHP:WBTS,3454,::" +prevDate+ "::;";
		
		String con = "", cmd = "";
		if(con.trim().toUpperCase().equals("ACTIVE"))
			cmd = "racclimx.sh -v -op MMLCommandExecution -DN " + rnc_dn + " -mmlCommand " + active;
		else
			cmd = "racclimx.sh -v -op MMLCommandExecution -DN " + rnc_dn + " -mmlCommand " + history;
		
		System.out.println(cmd);
	}

}
