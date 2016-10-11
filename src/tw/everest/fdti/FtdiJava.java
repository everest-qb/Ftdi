package tw.everest.fdti;



public class FtdiJava {

	public native long connect();
	
	public native void init();
	
	public native long disConnect();
	
	public native int nuOfdevice(); 
	
	public native void sendString(String str);
	
	public native String listen();
	
	public native String getSysVer();
	
	static {
        System.loadLibrary("FtdiJava");
    }
}

//D:\qtmp\workspace\neon_hc\Ftdi\src\tw\everest\fdti>"C:\Program Files\Java\jdk1.8.0_73\bin\javah.exe"
//-jni -cp "D:\qtmp\workspace\neon_hc\Ftdi\bin" tw.everest.fdti.FtdiJava