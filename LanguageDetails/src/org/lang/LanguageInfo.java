package org.lang;

public class LanguageInfo extends StateDetails {

	
	public void tamilLanguage() {
		System.out.println("tamil language");
	}
	
	public void englishLanguage() {
		System.out.println("English language");
	}

	public void hindiLanguage() {
		System.out.println("hindi language");
	}
	
public static void main(String[] args) {
		
		LanguageInfo l = new LanguageInfo();
		
		l.englishLanguage();
		l.hindiLanguage();
		l.tamilLanguage();
		l.northIndia();
		l.southIndia();
		
		
	}

}
