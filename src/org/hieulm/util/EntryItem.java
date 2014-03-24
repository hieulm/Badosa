package org.hieulm.util;


public class EntryItem implements Item{

	private String title;
	private String subtitle;

	public EntryItem(String title, String subtitle) {
		this.title = title;
		this.subtitle = subtitle;
	}
	
	public EntryItem(String title){
		this.title = title;
	}
	@Override
	public boolean isSection() {
		return false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	

}
