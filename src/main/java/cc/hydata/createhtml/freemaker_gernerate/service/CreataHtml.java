package cc.hydata.createhtml.freemaker_gernerate.service;


import cc.hydata.createhtml.freemaker_gernerate.bean.JsonRootBean;
import cc.hydata.createhtml.freemaker_gernerate.bean.Li;
import cc.hydata.createhtml.freemaker_gernerate.bean.Page;
import cc.hydata.createhtml.freemaker_gernerate.bean.PageBean;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CreataHtml {

    @Autowired
    private FreeMarkerConfig freemarkerConfig;

    @Autowired
    private Xml2ListBean xml2ListBean;

    @Value("${pathDir}")
    private String pathDir;


    public String createHtml() throws Exception {

        JsonRootBean jsonRootBean = xml2ListBean.getJsonRootBean();
//        判断该文件夹时候存在
        File file = new File(pathDir + "html");
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            Configuration configuration = freemarkerConfig.getConfiguration();
            if (jsonRootBean != null && !"".equals(jsonRootBean)) {
                List<PageBean> pageBeans = jsonRootBean.getDirectory().getPage();
//                生成三个子页面
                if (pageBeans != null && pageBeans.size() > 0) {
                    for (PageBean pageBean : pageBeans) {
                        String path = pathDir + "html\\" + pageBean.getName() + ".html";
                        Template template = configuration.getTemplate("boby.ftl");
                        Writer out = new FileWriter(path);
                        Map dataModel = new HashMap<>();
                        dataModel.put("pageBean", pageBean);
                        template.process(dataModel, out);
                        out.close();
                    }
                }
                Page page = jsonRootBean.getPage();
//                生成主页面
                if (page != null && !"".equals(page)) {
                    Template template = configuration.getTemplate("index.ftl");
                    String path = pathDir + "html\\" + page.getName() + ".html";
                    Writer out = new FileWriter(path);
                    Map map = new HashMap<String, Page>();
                    map.put("page", page);
                    template.process(map, out);
                    out.close();
                    return "成功";
                }
            }
            return "空";
        } catch (IOException e) {
            e.printStackTrace();
            return "失败";
        } catch (TemplateException e) {
            e.printStackTrace();
            return "失败";
        }
    }
}
