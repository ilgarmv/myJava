package ProxyTest;

interface ThirdPartyYouTubeLib {
    int listVideos();
    int getVideoInfo(String id);
    void downloadVideo(String id);

}

