package gameProject.abstracts;

import gameProject.entities.Campaign;

public interface CampaignService {
	void save(Campaign campaign);

	void update(Campaign campaign);

	void remove(Campaign campaign);
}
