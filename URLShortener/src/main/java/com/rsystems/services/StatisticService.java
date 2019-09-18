package com.rsystems.services;

import java.util.Map;

import com.rsystems.domains.Statistic;
import com.rsystems.domains.Url;
import com.rsystems.dtos.StatisticsSummaryDTO;

public interface StatisticService {
	public Statistic create(Statistic statistic);
	public Statistic mapFrom(Map<String, String> headers, Url url);
	public StatisticsSummaryDTO getStatisticsSummary();
	public StatisticsSummaryDTO getStatisticsSummaryByCode(String code);
}
