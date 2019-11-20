package cc.hydata.createhtml.freemaker_gernerate.bean;



public class JsonRootBean {

    public JsonRootBean(Directory directory, Page page) {
        this.directory = directory;
        this.page = page;
    }

    public JsonRootBean() {
    }

    private Directory directory;
    private Page page;
    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
    public Directory getDirectory() {
        return directory;
    }

    public void setPage(Page page) {
        this.page = page;
    }
    public Page getPage() {
        return page;
    }

}