package tw.everest.fdti.test01;


import tw.everest.fdti.FtdiJava;
import tw.everest.fdti.Util;

public class Run {

	public static void main(String[] args) throws Exception {					
		
		FtdiJava dll=new FtdiJava();		
		//int number=dll.nuOfdevice();
		//System.out.println(number);
		try {
			if (dll.connect() == Util.FT_OK) {
				dll.init();
				
				
				
				String tmp="1234567890";
						//DatatypeConverter.printHexBinary("1".getBytes());
				
				//System.out.println(tmp);
				dll.sendString(tmp);
				for(char i=(char)65;i<=(char)90;i++){  //65~90  A~Z  48~57 0~9
					tmp+=""+i;
					//dll.sendString(tmp);						
				}
				//System.out.println("ABC:"+dll.getSysVer());
				//System.out.println(dll.listen());
			}
		}finally {
			dll.disConnect();
		}
		
	}

}
