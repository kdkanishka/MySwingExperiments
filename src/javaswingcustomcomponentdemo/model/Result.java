/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingcustomcomponentdemo.model;

/**
 *
 * @author kanishka
 */
public class Result {

    private String pageTitle;
    private String content;

    public Result(String pageTitle, String content) {
        this.pageTitle = pageTitle;
        this.content = content;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
