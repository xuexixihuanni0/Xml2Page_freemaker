package cc.hydata.createhtml.freemaker_gernerate.bean;
import java.util.List;


public class Ul {
    public Ul() {
    }

    public Ul(List<Li> li) {
        this.li = li;
    }



    private List<Li> li;
    public void setLi(List<Li> li) {
        this.li = li;
    }
    public List<Li> getLi() {
        return li;
    }

}