package Video;

public abstract class Media {

    private String fileName;
    private int id;
    private static int nextId = 1;

    public Media() {
        this.id = nextId;
        nextId++;
    }

    public Media(String fileName) {
        this.fileName = fileName;
        this.id = nextId;
        nextId++;
    }

    public String getFileName() {
        return fileName;
    }

    public int getId() {
        return id;
    }
}
