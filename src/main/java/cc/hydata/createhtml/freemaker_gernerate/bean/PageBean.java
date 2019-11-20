package cc.hydata.createhtml.freemaker_gernerate.bean;


public class PageBean {

    @Override
    public String toString() {
        return "PageBean{" +
                "h1='" + h1 + '\'' +
                ", name='" + name + '\'' +
                ", p='" + p + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public PageBean() {
    }

    public PageBean(String h1, String name, String p, String title) {
        this.h1 = h1;
        this.name = name;
        this.p = p;
        this.title = title;
    }

    private String h1;
    private String name;
    private String p;
    private String title;

    public String getH1() {
        return h1;
    }

    public void setH1(String h1) {
        this.h1 = h1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}