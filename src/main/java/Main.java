import java.io.FileOutputStream;
import java.io.PrintStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import config.Propriedades;

public class Main {
	public static void main(String[] args) throws Exception {

		Propriedades prop = new Propriedades();
		String linha = "";

		FileOutputStream out = new FileOutputStream(prop.getCaminho(), true);
		PrintStream print = new PrintStream(out);
		Document doc = Jsoup.connect("https://www.cecomil.com.br/").get();

		Elements elements = doc.getElementsByClass("category-products");

		for (Element element : elements) {
			String titulo = element.getElementsByClass("product-name").text();
			String preco = element.getElementsByClass("price").text();

			print.println(titulo + ',' + preco);
		}
		print.close();
	}
}
