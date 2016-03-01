package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;

/**
 * 
 * @author Hury
 * 
 */

public class WinRegistry {


	public void dolly() throws IOException{

        
        
		FileInputStream origem; 
		FileOutputStream destino;
		FileChannel fcOrigem;
		FileChannel fcDestino;
		origem = new FileInputStream("src\\img\\dolly.jpg");//arquivo que você quer copiar
		destino = new FileOutputStream("C:\\temp\\dolly.jpg");//onde irá ficar a copia do aquivo
		        fcOrigem = origem.getChannel();
		        fcDestino = destino.getChannel();
		        fcOrigem.transferTo(0, fcOrigem.size(), fcDestino);//copiando o arquivo e salvando no diretório que você escolheu
		        origem.close();
		        destino.close();

        
	}
	
	
	public void wallpaper() {

			try{Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER,
					"Control Panel\\Desktop", "Wallpaper", "C:\\temp\\dolly.jpg" );
			}catch (Exception e) {
				System.out.println("Erro!, não é possivel inserir!");
			}

	}



}