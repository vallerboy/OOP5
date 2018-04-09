package memtask;

public class Mem {
    private String name;
    private String url;
    private String description;
    private boolean isFavourite;

    public Mem(String name, String url, String description, boolean isFavourite) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.isFavourite = isFavourite;
    }

    public Mem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    @Override
    public String toString() {
        return "Mem{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", isFavourite=" + isFavourite +
                '}';
    }
}
