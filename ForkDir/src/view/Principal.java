package view;

import control.Pastas;
import control.WinRegistry;

public class Principal {

	public static void main(String[] args) {
		
		WinRegistry wi = new WinRegistry();
		wi.dolly();
		wi.wallpaper();
		
		Thread a = new Pastas("A");
		Thread b = new Pastas("B");
		Thread c = new Pastas("C");
		Thread d = new Pastas("D");
		Thread e = new Pastas("E");
		Thread f = new Pastas("F");
		Thread g = new Pastas("G");
		Thread h = new Pastas("H");
		Thread i = new Pastas("I");
		Thread j = new Pastas("J");
		
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
		
	}
	
}
