 
package br.com.javamais.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author javamais.com.br
 */
public class JsoupStringHTML {
    
    public static void main(String[] args) {
        
        String html = "<p>Programming in Java <a href='http://javamais.com.br/'><b>My Site</b></a></p>";
        Document document = Jsoup.parse(html);
        Element link = document.select("a").first();
        String href = link.attr("href"); // get link
        String text = link.text(); // get description
        String outerHTML = link.outerHtml(); // get full html
        String InnerHTML = link.html(); // get html and tags  
        
        System.out.println("HREF: " + href);
        System.out.println("TEXT: " + text);
        System.out.println("OUTER HTML: " + outerHTML);
        System.out.println("INNER HTML: " + InnerHTML);
  
    }
    
 
    
}
