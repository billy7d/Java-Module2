public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedLIn linkedLIn;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedLIn linkedLIn){
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedLIn = linkedLIn;
    }

    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedLIn.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.linkedLIn.share();
    }
}
