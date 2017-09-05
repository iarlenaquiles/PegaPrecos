import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {
	public static void main(String[] args) throws Exception {
		Document doc = Jsoup.connect("https://www.amazon.com.br/gp/product/8555792266/ref=s9_acsd_hps_bw_c_x_2_w?pf_rd_m=A1ZZFT5FULY4LN&pf_rd_s=merchandised-search-5&pf_rd_r=7TMWWPJT3TWHV9W6AV69&pf_rd_r=7TMWWPJT3TWHV9W6AV69&pf_rd_t=101&pf_rd_p=2018f410-54ae-4d3e-9577-99669b7a3cec&pf_rd_p=2018f410-54ae-4d3e-9577-99669b7a3cec&pf_rd_i=7842710011").get();
		
		String title = doc.title();
		
		System.out.println(title);
		
		Element preco = doc.select(".a-color-price").first();
		
		System.out.println(preco.text());
	}
}
