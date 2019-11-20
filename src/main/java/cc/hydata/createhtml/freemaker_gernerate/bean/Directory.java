package cc.hydata.createhtml.freemaker_gernerate.bean;
import java.util.List;


public class Directory {
    public Directory() {
    }

    public Directory(String name, List<PageBean> page) {
        this.name = name;
        this.page = page;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", page=" + page +
                '}';
    }

    private String name;
    private List<PageBean> page;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setPage(List<PageBean> page) {
         this.page = page;
     }
     public List<PageBean> getPage() {
         return page;
     }

}