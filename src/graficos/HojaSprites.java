package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public final class HojaSprites {

	private String ruta;
	
	private final int x;
	private final int y;
	
	int totalPixeles;

	public int[] pixeles;
	
	private BufferedImage image;

	// coleccion de hojas de sprites
	public static HojaSprites desierto = new HojaSprites("/images/texturas/desierto.png", 320, 320);
	public static HojaSprites subterraneo = new HojaSprites("/images/texturas/subterraneo.png", 320, 320);
	public static HojaSprites jugador = new HojaSprites("/images/Jugador.png", 128, 96);
	public static HojaSprites desierto2 = new HojaSprites("/images/texturas/4.png", 320, 320);

	// fin de la coleccion

	public HojaSprites(final String ruta, final int x, final int y) {

		this.x = x;
		this.y = y;

		totalPixeles = x * y;
		
		pixeles = new int[totalPixeles];
		
		try {

			URL url = HojaSprites.class.getResource(ruta);
			
			image = ImageIO.read(url);

			pixeles = image.getRGB(0, 0, x, y, null, 0, x);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}

	}

	public String getRuta() {
		
		return ruta;
		
	}

	public void setRuta(String ruta) {
		
		this.ruta = ruta;
		
	}

	public BufferedImage getImage() {
		
		return image;
		
	}

	public void setImage(BufferedImage image) {
		
		this.image = image;
		
	}

	public int[] getPixeles() {

		return pixeles;

	}

	public void setPixeles(int[] pixeles) {

		this.pixeles = pixeles;

	}

	public int getX() {
		
		return x;
	
	}

	public int getY() {
	
		return y;
	
	}
	

	public int getTotalPixeles() {
	
		return totalPixeles;
	
	}

	public void setTotalPixeles(int totalPixeles) {
	
		this.totalPixeles = totalPixeles;
	
	}

}
