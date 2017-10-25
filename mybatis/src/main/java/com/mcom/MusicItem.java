package com.mcom;

import java.math.BigDecimal;
import java.util.Date;

public class MusicItem {
	private Long id;
	private String title, artist;
	private Date releaseDate;
	private BigDecimal price;
	private MusicCategory musicCategory;
	
	public MusicItem() {}
	
	public MusicItem(Long id, String title, String artist, Date releaseDate, BigDecimal price,
			MusicCategory musicCategory) {
		super();
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.releaseDate = releaseDate;
		this.price = price;
		this.musicCategory = musicCategory;
	}
	
	public String toString() {
		return "MusicItem [id=" + id + ", title=" + title + " artist=" + artist + " releaseDate=" + releaseDate + " price=" + price + " musicCategory=" + musicCategory;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public MusicCategory getMusicCategory() {
		return musicCategory;
	}
	public void setMusicCategory(MusicCategory musicCategory) {
		this.musicCategory = musicCategory;
	}

}
