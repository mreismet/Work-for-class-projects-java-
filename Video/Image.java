package Video;

public class Image extends Media implements Interface1.ImageStandard {

    private String imageCodec;

    public Image(String fileName, String imageCodec) {
        super(fileName);
        this.imageCodec = imageCodec;
    }
    public String getImagineCoded()
    {
        return "Image codec: " + imageCodec;
    }
    public String getMediaInfo()
    {
        String temp = "Image ID: " + super.getId() + " \n" + "Image name: " + super.getFileName() +"\n"+ getImagineCoded();
        return temp;
    }

}
