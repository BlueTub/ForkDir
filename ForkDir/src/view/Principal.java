package view;

import java.io.File;
import java.io.IOException;

import control.Pastas;
import control.WinRegistry;

public class Principal {

	public static void main(String[] args) {
		
		StringBuffer sbDir = new StringBuffer();
		sbDir.append(System.getProperty("user.home"));
		sbDir.append(File.separator);
		sbDir.append("Desktop");
		sbDir.append(File.separator);
		
		WinRegistry wi = new WinRegistry();
		wi.dolly();
		wi.wallpaper();
		

		Thread a = new Pastas("A",sbDir);
		Thread b = new Pastas("B",sbDir);
		Thread c = new Pastas("C",sbDir);
		Thread d = new Pastas("D",sbDir);
		Thread e = new Pastas("E",sbDir);
		Thread f = new Pastas("F",sbDir);
		Thread g = new Pastas("G",sbDir);
		Thread h = new Pastas("H",sbDir);
		Thread i = new Pastas("I",sbDir);
		Thread j = new Pastas("J",sbDir);
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		f.start();
		g.start();
		h.start();
		i.start();
		j.start();
		
		//try {
		//	Runtime.getRuntime().exec("img\\f.bat");
		//} catch (IOException e1) {
		//	e1.printStackTrace();
		//}
		
	}
	
}
