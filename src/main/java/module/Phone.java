package module;

import javax.print.DocFlavor;

public class Phone {
    private String name;
    private String age;
    private String id;
    private String imageUrl;
    private String snippet;

    public String getName() {
        return name;
    }

    public Phone setName(String phoneName) {
        this.name = phoneName;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Phone setAge(String age) {
        this.age = age;
        return this;
    }

    public String getId() {
        return id;
    }

    public Phone setId(String id) {
        this.id = id;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Phone setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getSnippet() {
        return snippet;
    }

    public Phone setSnippet(String snippet) {
        this.snippet = snippet;
        return this;
    }
}
