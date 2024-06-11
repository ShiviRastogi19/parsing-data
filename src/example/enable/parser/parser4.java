package example.enable.parser;

public class parser4 {

	public static void main(String[] args) {
		
		//3.7.1
		String commandOutput = ",,,,,,,,PLMN-PLMN/RNC-11/WBTS-3012,UPI_BENALCAZAR_1,UPIBEN012,10.115.162.203,3,PLMN-PLMN/"
				+ "RNC-11/WBTS-3012/WCEL-30012,UPI_BENALCAZAR_1_1A,1,0";
		
		String a[] = commandOutput.split("\n");String arr = "";
		for (String s : a) {
			
			arr = s.split("/")[2].split(",")[3];
			System.out.println(arr);
		}
		
		String Url = "https://"+arr+"/protected/Reboot.html"; 
		
		System.out.println(Url);
	}

}
