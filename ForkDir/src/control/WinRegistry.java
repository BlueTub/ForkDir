package control;

import java.io.File;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;

/**
 * 
 * @author Hury
 * 
 */

public class WinRegistry {


	public void dolly(){
        // arquivo a ser movido
        File arquivo = new File("/img/dolly.jpg");
    
        // diretorio de destino
        File dir = new File("c:/");
    
        // move o arquivo para o novo diretorio
        boolean ok = arquivo.renameTo(new File(dir, arquivo.getName()));
        if(ok){
            System.out.println("Arquivo foi movido com sucesso");
        }
        else{
            System.out.println("Nao foi possivel mover o arquivo");
        }
	}
	
	
	public void wallpaper() {

			try{Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER,
					"Control Panel\\Desktop", "Wallpaper", "C:\\dolly" );
			}catch (Exception e) {
				System.out.println("Erro!, não é possivel inserir!");
			}

	}



}