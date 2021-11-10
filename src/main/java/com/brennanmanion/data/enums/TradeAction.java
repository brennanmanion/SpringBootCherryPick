package com.brennanmanion.data.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;

public enum TradeAction {
	BUY(0), SELL(1);
	
	private int ord;
	
	private ResourceBundle resources = ResourceBundle.getBundle(TradeAction.class.getSimpleName());
	
	TradeAction(final int ord)
	{
		this.ord = ord;
	}
	
	public Integer getInteger()
	{
		return Integer.valueOf(this.ord);
	}
	
	public int getInt()
	{
		return this.ord;
	}
	
	public String getText()
	{
		return resources.getString(TradeAction.class.getSimpleName() + "." + ord);
	}
	
	public TradeAction getValue()
	{
		return this;
	}
	
	public static TradeAction valueOfInteger(final Integer integer)
	{
		for( int i = 0; i< TradeAction.values().length; i++)
		{
			if(TradeAction.values()[i].getInteger().intValue() == integer.intValue())
			{
				return TradeAction.values()[i];
			}
		}
		return null;
	}
	
	public static TradeAction valueOfText(final String text)
	{
		for (int i = 0; i< TradeAction.values().length; i++)
		{
			if (TradeAction.values()[i].getText().compareToIgnoreCase(text) == 0)
			{
				return TradeAction.values()[i];
			}
		}
		return null;
	}
	
	public static List<TradeAction> getValuesList()
	{
		final List<TradeAction> list = new ArrayList<TradeAction>();
		
		for (int i = 0; i< TradeAction.values().length; i++)
		{
			list.add(TradeAction.values()[i]);
		}
		
		Collections.sort(list, new Comparator<TradeAction>()
		{
			@Override
			public int compare(final TradeAction arg0, final TradeAction arg1)
			{
				return arg0.getText().compareTo(arg1.getText());
			}
		});
		
		return list;
	}
}