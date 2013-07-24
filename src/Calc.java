public class Calc {
	NewJFrame gFrame;
	Calc(NewJFrame jFrame){
		gFrame = jFrame;
	}
	
	public String mac = "";
	
	public void generateKey(String mac){
		try{
		String key = "";
		
		mac = mac.replace(":", "");
		mac = mac.replace(" ", "");
		mac = mac.trim();
		
		if(mac.length() == 12){
		
			int buffer = Integer.parseInt(mac.substring(8), 16);
			String C1 = String.valueOf(buffer);
			
			while(C1.length() < 5){
				C1 = 0 + C1;
			}
			char S6 = C1.charAt(0);
			char S7 = C1.charAt(1);
			char S8 = C1.charAt(2);
			char S9 = C1.charAt(3);
			char S10 = C1.charAt(4);
			
			char M7 = mac.charAt(6);
			char M8 = mac.charAt(7);
			char M9 = mac.charAt(8);
			char M10 = mac.charAt(9);
			char M11 = mac.charAt(10);
			char M12 = mac.charAt(11);
			
			String bufK1 = Integer.toHexString(Character.digit(S7, 16) + Character.digit(S8, 16) + Character.digit(M11, 16) + Character.digit(M12, 16));
			String bufK2 = Integer.toHexString(Character.digit(M9, 16) + Character.digit(M10, 16) + Character.digit(S9, 16) + Character.digit(S10, 16));
			
			char K1 = bufK1.charAt(bufK1.length() -1 );
			char K2 = bufK2.charAt(bufK2.length() - 1);
			
			String X1 = Integer.toHexString(Character.digit(K1, 16) ^ Character.digit(S10, 16));
			String X2 = Integer.toHexString(Character.digit(K1, 16) ^ Character.digit(S9, 16));
			String X3 = Integer.toHexString(Character.digit(K1, 16) ^ Character.digit(S8, 16));
			String Y1 = Integer.toHexString(Character.digit(K2, 16) ^ Character.digit(M10, 16));
			String Y2 = Integer.toHexString(Character.digit(K2, 16) ^ Character.digit(M11, 16));
			String Y3 = Integer.toHexString(Character.digit(K2, 16) ^ Character.digit(M12, 16));
			String Z1 = Integer.toHexString(Character.digit(M11, 16) ^ Character.digit(S10, 16));
			String Z2 = Integer.toHexString(Character.digit(M12, 16) ^ Character.digit(S9, 16));
			String Z3 = Integer.toHexString(Character.digit(K1, 16) ^ Character.digit(K2, 16));
			
			key = X1 + Y1 + Z1 + X2 + Y2 + Z2 + X3 + Y3 + Z3;
			
			gFrame.jTFKey.setText(key.toUpperCase());			
			
			
		}else{
			
			gFrame.jErrorLabel.setText("Die MAC-Adresse muss 12-stellig sein!");
			
			
		}
		}catch(NumberFormatException e){
			
			gFrame.jErrorLabel.setText("Bitte eine gültige MAC eingeben. Sie darf nur Zahlen und Buchstaben von A-F enthalten!");			
			gFrame.jTFMac.setText("");
		}
		
		
	}
	

}
