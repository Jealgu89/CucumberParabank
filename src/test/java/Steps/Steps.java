package Steps;

import context.TestContext;



import pages.*;


public class Steps {


    TestContext testContext;
    HomePage homePage;


    public Steps(TestContext context) {

        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();

    }

}






















