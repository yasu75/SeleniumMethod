package Annotation;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.testng.annotations.Test;

public class TimeOuts {
	@Test(timeOut=1500)//bu methodun gorevini yapabilmesi icin max bu kadar suresi var
	public void timeTestOne() throws InterruptedException{
		Thread.sleep(1000);
	System.out.println("");
		
	}
	@Test(timeOut=1300)
	public void timeTestTwo() throws InterruptedException{
		Thread.sleep(400);
	System.out.println("");

	}
}