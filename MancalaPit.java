package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class MancalaPit extends JPanel
{
	private Shape mancalaShape;

	public MancalaPit()
	{
	}

	public MancalaPit(Shape shape)
	{
		mancalaShape = shape;
		this.setBounds(mancalaShape.getBounds());
		this.setPreferredSize(new Dimension((int)shape.getBounds().getWidth(),(int)shape.getBounds().getHeight()));
	}

	public Shape getShape()
	{
		return mancalaShape;
	}

	public void setShape(Shape s)
	{
		mancalaShape = s;
		this.setBounds(mancalaShape.getBounds());
		this.setPreferredSize(new Dimension((int)mancalaShape.getBounds().getWidth(),(int)mancalaShape.getBounds().getHeight()));
	}

	@Override
	public Dimension getPreferredSize()
	{
		return new Dimension((int)mancalaShape.getBounds().getHeight(), (int) mancalaShape.getBounds().getWidth());

	}

}
