package gameProject.abstracts;

import gameProject.entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService {

	@Override
	public void save(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� veri taban�na eklendi!");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� g�ncellendi!");
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� veri taban�ndan kald�r�ld�!");
	}

}
