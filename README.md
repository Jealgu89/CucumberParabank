# CucumberParabank

This is a small study project for myself in which I use Cucumber in combination with Selenium to test the https://parabank.parasoft.com/parabank/index.htm website.

So far I created four feature files and created stepdefinitions to execute test. I leverage the page object model and Picocontainer in an attempt to make an easily maintainable project.

Things I like to add or improve when I have time:
* Investigate reporting options
* Investigate the option to make printscreen in case of errors/findings
* Add some test in which I use Rest Assured to check some information via HTTP call.
* Expand the amount of testcases and make existing testcases more detailed
* Try to let the tests run stable after removing some of the Thread.sleeps I put into the code.
