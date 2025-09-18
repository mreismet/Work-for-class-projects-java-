package Video;

public class Video extends Media implements Interface1.ImageStandard, Interface1.IAudioStandard {
    private String imageCodec;
    private String audioCodec;

    public Video(String fileName, String imageCodec, String audioCodec) {
        super(fileName);
        this.imageCodec = imageCodec;
        this.audioCodec = audioCodec;
    }

    public String getImagineCoded()
    {
        return "Image codec: " + imageCodec;
    }

    public String getAudioCodec()
    {
        return "Audio Codec: " + audioCodec;
    }

    public String getMediaInfo()
    {
        String temp = "Video ID: " + super.getId() + " \n" + "Video name: " + super.getFileName() +" \n" + getImagineCoded() + "\n" +  getAudioCodec();
        return temp;
    }
}
