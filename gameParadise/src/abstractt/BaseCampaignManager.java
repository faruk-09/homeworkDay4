package abstractt;

import entity.Campaign;

public abstract class BaseCampaignManager implements ICampaignService {

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("Þimdi daha uygun fiyata sahip olabilirsiniz : " +campaign.getCampaignName() );
		
	}

	@Override
	public void campaigndelete(Campaign campaign) {
		System.out.println("Kampanya sona erdi! : " +campaign.getCampaignName());
		
	}

	@Override
	public void campaign(Campaign campaign, int campaignId, String campaignName, double campaignRate) {
		campaign.setCampaignId(campaignId);
		campaign.setCampaignName(campaignName);
		
		
		System.out.println("Kampanya baþarýyla güncellendi " +campaign.getCampaignName());
		
	}

}
