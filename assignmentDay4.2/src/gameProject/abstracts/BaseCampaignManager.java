package gameProject.abstracts;

import gameProject.entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService {

	@Override
	public void save(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý veri tabanýna eklendi!");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý güncellendi!");
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyasý veri tabanýndan kaldýrýldý!");
	}

}
