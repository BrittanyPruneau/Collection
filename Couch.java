package labCollection;

import java.awt.Color;
import javax.swing.text.AttributeSet.ColorAttribute;

/*
 * Contains couch colors and the fabric material of the couch.
 */
public class Couch
{
	private Color color;
	private Material material;
	/**
	 * Creates a new couches color and material. 
	 * 
	 * @param color
	 * @param material
	 */
	public Couch(Color color, Material material)
	{
		this.color = color;
		this.material = material;
	}
	
	/**
	 * Lets the user know the color of the couch. 
	 */
	public Color getColor()
	{
		return color;
	}
	
	/**
	 * Lets the user know what material the couch is made of. 
	 */
	public Material getMaterial()
	{
		return material;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Couch other = (Couch) obj;
		if (color == null)
		{
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (material != other.material)
			return false;
		return true;
	}
	/*
	 * Displays Couch: {couch color in hexidecimal format} {couch material} 
	 */
	@Override
	public String toString()
	{
		String lowerMaterial = this.material.toString().toLowerCase();
		this.color.getRGB();
		String hexColor = "#"+Integer.toHexString(this.color.getRGB()).substring(2);
		return "Couch: " + hexColor + " " + lowerMaterial;
	} 
}
