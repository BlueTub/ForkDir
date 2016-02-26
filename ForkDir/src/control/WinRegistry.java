package control;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;

public class WinRegistry {
//HKEY_CURRENT_USER\Control Panel\Desktop
	

	try{Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER,
			"Control Panel", "Desktop", "C:\\dolly" );
	}catch (Exception e) {
		System.out.println("Erro!, não é possivel inserir!");
	}
	
	
}
