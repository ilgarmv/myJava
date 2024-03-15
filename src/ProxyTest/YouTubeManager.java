package ProxyTest;

public class YouTubeManager {
    private ThirdPartyYouTubeLib service;

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(String id) {
        service.getVideoInfo(id);

    }

    public void renderListPanel() {
        service.listVideos();
    }

    public void reactOnUserInput() {
        renderVideoPage("video1");
        renderListPanel();
    }
}
