package com.learn.algo;

/**
 * Hello world!
 *
 */
public class App 
{
	private String test="one";
	App(){
		this.setTest("two");
	}
    public static void main( String[] args )
    {
    	App app=new App();
        System.out.println( "Hello World!" );
        System.out.println(app.getTest());
    }
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
}
