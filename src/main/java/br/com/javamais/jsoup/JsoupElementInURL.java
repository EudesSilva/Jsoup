 
package br.com.javamais.jsoup;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author ho
 */
public class JsoupElementInURL {
    
    public static void main(String[] args) {
        
        try {
            String url = "http://www.google.com.br";
            Document document = Jsoup.connect(url).get();
            Elements images = document.select("[src]");
 
            for (Element src : images) {
                 System.out.println("IMAGEM: " + src ); 
            }
 
        } catch (IOException ex) {
            System.out.println("ERROR: Get URL");
        }
  
    }
 

}
