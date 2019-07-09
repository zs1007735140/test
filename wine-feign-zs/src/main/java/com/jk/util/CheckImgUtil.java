package com.jk.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckImgUtil {

	public static void buildCheckImg(HttpServletRequest request,HttpServletResponse response) {
		try {
			checkImg(request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//鑾峰彇楠岃瘉鐮佸浘鐗囧苟鐢熸垚鍒板墠鍙�
    public static String checkImg(HttpServletRequest request,HttpServletResponse response) throws Exception{  
        int width = 120;
        int height = 35;
  
        // 姝ラ涓� 缁樺埗涓�寮犲唴瀛樹腑鍥剧墖  
        BufferedImage bufferedImage = new BufferedImage(width, height,  
                BufferedImage.TYPE_INT_RGB);  
  
        // 姝ラ浜� 鍥剧墖缁樺埗鑳屾櫙棰滆壊 ---閫氳繃缁樺浘瀵硅薄  
        Graphics graphics = bufferedImage.getGraphics();// 寰楀埌鐢诲浘瀵硅薄 --- 鐢荤瑪  
        // 缁樺埗浠讳綍鍥惧舰涔嬪墠 閮藉繀椤绘寚瀹氫竴涓鑹�  
        graphics.setColor(getRandColor(200, 250));  
        graphics.fillRect(0, 0, width, height);  
  
        // 姝ラ涓� 缁樺埗杈规  
        graphics.setColor(Color.WHITE);  
        graphics.drawRect(0, 0, width - 1, height - 1);  
  
        // 姝ラ鍥� 鍥涗釜闅忔満鏁板瓧  
        Graphics2D graphics2d = (Graphics2D) graphics;  
        // 璁剧疆杈撳嚭瀛椾綋  
        graphics2d.setFont(new Font("瀹嬩綋", Font.BOLD, 18));  
          
        //瀹氫箟涓�涓寘鍚ぇ灏忓啓瀛楁瘝鍜屾暟缁勭殑瀛楃涓�
         String words ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890"; 
         //鐢熸垚涓�涓殢鏈烘暟
         Random random = new Random();// 鐢熸垚闅忔満鏁�  
         // 瀹氫箟StringBuffer  鐢ㄦ潵鎷兼帴鐢熸垚鐨勫洓浣嶉獙璇佺爜
         StringBuffer sb = new StringBuffer();  
         // 瀹氫箟x鍧愭爣  
         int x = 10;  
         for (int i = 0; i < 4; i++) {  
             // 闅忔満棰滆壊  
             graphics2d.setColor(new Color(20 + random.nextInt(110), 20 + random  
                     .nextInt(110), 20 + random.nextInt(110)));  
             // 鏃嬭浆 -30 --- 30搴�  
             int jiaodu = random.nextInt(60) - 30;  
             // 鎹㈢畻寮у害  
             double theta = jiaodu * Math.PI / 180;
   
             // 鐢熸垚涓�涓殢鏈烘暟瀛�  鐢ㄦ潵浣滀负瀛楃涓茬殑涓嬫爣
             int index = random.nextInt(words.length()); // 鐢熸垚闅忔満鏁� 0 鍒� length - 1  
             // 鑾峰緱瀛楁瘝鏁板瓧   charAt() 閫氳繃涓嬫爣鍙栧瓧绗︿覆涓搴旂殑瀛楃
             char c = words.charAt(index);  
             //灏嗘瘡娆″惊鐜緱鍒扮殑涓�涓殢鏈哄瓧绗︽嫾鎺ュ埌 sb 鍙橀噺涓�
             sb.append(c);  
             // 灏哻 杈撳嚭鍒板浘鐗�  
             graphics2d.rotate(theta, x, 20);  
             graphics2d.drawString(String.valueOf(c), x, 20);  
             graphics2d.rotate(-theta, x, 20);  
             x += 30;  
         }  
         //******灏嗙敓鎴愮殑鍥涗綅楠岃瘉鐮佸瓨鍒皊ession涓�
         request.getSession().setAttribute("checkcode", sb.toString());  
        
         //瀵归獙璇佺爜鍥剧墖鏍峰紡鐨勮缃�
         graphics.setColor(getRandColor(160, 200));  
         int x1;  
         int x2;  
         int y1;  
         int y2;  
         for (int i = 0; i < 30; i++) {  
             x1 = random.nextInt(width);  
             x2 = random.nextInt(12);  
             y1 = random.nextInt(height);  
             y2 = random.nextInt(12);  
             graphics.drawLine(x1, y1, x1 + x2, x2 + y2);  
         }  
         
         // 灏嗕笂闈㈠浘鐗囪緭鍑哄埌娴忚鍣� ImageIO  
         graphics.dispose();// 閲婃斁璧勬簮  
         ImageIO.write(bufferedImage, "jpg",response.getOutputStream());  
         return null;
     }
	
	/** 
	 * 鍙栧叾鏌愪竴鑼冨洿鐨刢olor 缁欓獙璇佺爜鍥剧墖杩涜璁剧疆
	 * @param fc 
	 *            int 鑼冨洿鍙傛暟1 
	 * @param bc 
	 *            int 鑼冨洿鍙傛暟2 
	 * @return Color 
	 */  
	private static Color getRandColor(int fc, int bc) {  
	    // 鍙栧叾闅忔満棰滆壊  
	    Random random = new Random();  
	    if (fc > 255) {  
	        fc = 255;  
	    }  
	    if (bc > 255) {  
	        bc = 255;  
	    }  
	    int r = fc + random.nextInt(bc - fc);  
	    int g = fc + random.nextInt(bc - fc);  
	    int b = fc + random.nextInt(bc - fc);  
	    return new Color(r, g, b);  
	}  
}
