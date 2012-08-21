package org.digitalcampus.mtrain.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Module implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4412987572522420704L;
	
	public static final String TAG = "Module";
	private int modId;
	private String location;
	private ArrayList<Lang> titles = new ArrayList<Lang>();
	private String shortname;
	private float progress = 0;
	private HashMap<String,String> props;
	private Double versionId;
	private boolean installed;
	private boolean toUpdate;
	private String downloadUrl;

	public Module() {

	}
	
	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	
	
	public Double getVersionId() {
		return versionId;
	}

	public void setVersionId(Double versionId) {
		this.versionId = versionId;
	}

	public boolean isInstalled() {
		return installed;
	}

	public void setInstalled(boolean installed) {
		this.installed = installed;
	}

	public boolean isToUpdate() {
		return toUpdate;
	}

	public void setToUpdate(boolean toUpdate) {
		this.toUpdate = toUpdate;
	}

	public HashMap<String, String> getProps() {
		return props;
	}

	public void setProps(HashMap<String, String> props) {
		this.props = props;
	}

	public float getProgress() {
		return progress;
	}

	public void setProgress(float progress) {
		this.progress = progress;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public int getModId() {
		return modId;
	}

	public void setModId(int modId) {
		this.modId = modId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTitle(String lang) {
		for(Lang l: titles){
			if(l.getLang().equals(lang)){
				return l.getContent();
			}
		}
		if(titles.size() > 0){
			return titles.get(0).getContent();
		}
		return "No title set";
	}

	public void addTitle(String lang, String title) {
		// TODO check that this lang isn't already in list
		this.titles.add(new Lang(lang,title));
	}
	
	public void setTitles(ArrayList<Lang> titles) {
		this.titles = titles;
	}
}
