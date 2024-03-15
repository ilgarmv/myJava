package ProxyTest;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib{


    private ThirdPartyYouTubeLib service;
    private boolean needReset;
    int listCache;
    int videoCache;

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;

        this.listCache = listCache;
        this.videoCache = videoCache;
    }
    @Override
    public int listVideos() {
       if(listCache == 0 || needReset){
           service.listVideos();

       }
        return listCache;
    }

@Override
public void downloadVideo(String id) {

    if(needReset) service.downloadVideo(id);
}


    @Override
    public int getVideoInfo(String id) {

        if(videoCache == 0 || needReset) videoCache = service.getVideoInfo(id);
        return videoCache;
    }
}