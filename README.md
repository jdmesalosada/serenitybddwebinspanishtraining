README
SERENITY WEB TRAINING

Run the tests:
gradle clean test -Pwebdriver.driver=chrome -Denvironment=staging

Run the tests by tag:
gradle clean test -Pwebdriver.driver=chrome -Denvironment=staging -Dcucumber.options="--tags @login"

Running with Maven
mvn clean verify -Dcucumber.options="--tags @Login"