package cc.hydata.createhtml.freemaker_gernerate.bean;


public class Page {

    private String h1;
    private String name;
    private String p;

    public Page() {
    }

    public Page(String h1, String name, String p, String title, Ul ul) {
        this.h1 = h1;
        this.name = name;
        this.p = p;
        this.title = title;
        this.ul = ul;
    }

    private String title;
    private Ul ul;
    public void setH1(String h1) {
        this.h1 = h1;
    }
    public String getH1() {
        return h1;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setP(String p) {
        this.p = p;
    }
    public String getP() {
        return p;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setUl(Ul ul) {
        this.ul = ul;
    }
    public Ul getUl() {
        return ul;
    }

}