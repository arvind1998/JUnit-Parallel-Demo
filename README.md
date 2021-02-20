# JUnit-Parallel-Demo

 - Author : Sanket Mali, Senior Customer Engineer, BrowserStack 
 - Original repo : https://github.com/sanketsmali/JunitParallelExample

Instructions:

1. Add your BROWSERSTACK_USERNAME and BROWSERSTACK_ACCESS_KEY to Base.java file. 
2. These are the independent test files - Demo.java, Demo2.java, Demo3.java, Demo4.java each with its own device capabilities. 
3. TestClassParallel.java is the one where we need to pass all the classes to be run in parallel. 
4. Type 'mvn test' to run the test after which you can see the result on your BrowserStack Automate dashboard.
