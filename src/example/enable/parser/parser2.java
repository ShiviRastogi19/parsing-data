package example.enable.parser;

public class parser2 {
	public static void main(String agrs[]) { //
		String str = ",,,,,,,,PLMN-PLMN/RNC-11/WBTS-3012,UPI_BENALCAZAR_1,UPIBEN012,10.115.162.203,3,"
				+ "PLMN-PLMN/RNC-11/WBTS-3012/WCEL-30012,UPI_BENALCAZAR_1_1A,1,0 \n" +
				",,,,,,,,PLMN-PLMN/RNC-11/WBTS-3012,UPI_BENALCAZAR_1,UPIBEN012,10.115.162.203,3,"
				+ "PLMN-PLMN/RNC-11/WBTS-3012/WCEL-30012,UPI_BENALCAZAR_1_1A,1,0 \n" +
				",,,,,,,,PLMN-PLMN/RNC-11/WBTS-3012,UPI_BENALCAZAR_1,UPIBEN012,10.115.162.203,3,"
				+ "PLMN-PLMN/RNC-11/WBTS-3012/WCEL-30012,UPI_BENALCAZAR_1_1A,1,0 \n";
				
		String a[] = str.split("\n");
		for (String s : a) {
			//System.out.println(s);
			String arr = s.split("/")[2].split(",")[3];
			System.out.println(arr);
		}
	}
}
