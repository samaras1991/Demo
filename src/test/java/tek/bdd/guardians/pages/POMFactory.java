package tek.bdd.guardians.pages;

import tek.bdd.guardians.base.BaseSetup;


public class POMFactory extends BaseSetup {
    private HomePage homePage;

    public POMFactory() {
        this.homePage = new HomePage();

    }

    public HomePage homePage() {//get method to access locator on 
    	//page object
        return this.homePage;
    }

}

