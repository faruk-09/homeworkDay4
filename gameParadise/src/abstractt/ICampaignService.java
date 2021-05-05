package abstractt;

import entity.Campaign;

public interface ICampaignService {
	void campaignAdd(Campaign campaign);
	void campaigndelete(Campaign campaign);
	void campaign(Campaign campaign ,int campaignId, String campaignName, double campaignRate);

}
