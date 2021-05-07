package patterns.creational.o4Builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setWebsiteBuilder(new EnterpriceWebsiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website );
    }
}
