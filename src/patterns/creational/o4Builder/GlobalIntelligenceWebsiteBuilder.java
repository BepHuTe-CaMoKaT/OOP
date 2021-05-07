package patterns.creational.o4Builder;

public class GlobalIntelligenceWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("GlobalIntelligence");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
