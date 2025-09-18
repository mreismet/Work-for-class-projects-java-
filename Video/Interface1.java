package Video;

public class Interface1 {
    interface IMediaStandard
    {
        String getMediaInfo();

    }

    interface IAudioStandard extends IMediaStandard
    {
        String getAudioCodec();
    }

    interface ImageStandard extends IMediaStandard
    {
        String getImagineCoded();
    }



}
