package Video;

public class Music extends Media implements Interface1.IAudioStandard {
    private String audioCodec;

    public Music(String fileName, String audioCodec) {
        super(fileName);
        this.audioCodec = audioCodec;
    }


    public String getAudioCodec()
    {
        return "Audio Codec: " + audioCodec;
    }
    public String getMediaInfo()
    {
        String temp = "Music ID: " + super.getId() + " \n" + "Music name: " + super.getFileName() +" \n" +  getAudioCodec();
        return temp;
    }
}
