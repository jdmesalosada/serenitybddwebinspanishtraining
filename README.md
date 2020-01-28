README
SERENITY WEB TRAINING

Run the tests:
gradle clean test -Pwebdriver.driver=chrome -Denvironment=staging

Run the tests by tag:
gradle clean test -Pwebdriver.driver=chrome -Denvironment=staging -Dcucumber.options="--tags @login"

Running with Maven
mvn clean verify -Dcucumber.options="--tags @Login"  //if you don't specify the environment it will tajke
the environment you specify in the serneity conf.

to run an specific runner
mvn clean verify -Dtest=testPath serenity:aggregate