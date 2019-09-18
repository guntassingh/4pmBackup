package com.rsystems.services;

import com.rsystems.domains.Url;
import com.rsystems.dtos.CreateLinkDTO;
import com.rsystems.dtos.LinkDTO;

public interface UrlService {
	/**
	 * 
	 * @param urlCode
	 * @return
	 */
	public Url find(String urlCode);
	/**
	 * 
	 * @param urlDto
	 * @return
	 */
	public LinkDTO createShortURL(CreateLinkDTO urlDto) ;
	
	public Url fromDTO(CreateLinkDTO urlDto);
	public LinkDTO toLinkDTO(Url url);
}
