# JUnitCategories
Figure out how to use @Category in a multiple-module Maven project

## Maven surefire plugin
- The surefire plugin has default file patterns it looks for to run as unit tests
  - http://maven.apache.org/surefire/maven-surefire-plugin/examples/inclusion-exclusion.html
- We're supposed to be able to include groups via the JUnit @Category
  - http://maven.apache.org/surefire/maven-surefire-plugin/test-mojo.html#groups
- We're supposed to be able to exclude tests via the JUnit @Category
  - http://maven.apache.org/surefire/maven-surefire-plugin/test-mojo.html#excludedGroups

## Maven failsafe plugin
- The failsafe plugin is to be used when artifacts have to be created or deployed in order to test
  - http://maven.apache.org/surefire/maven-failsafe-plugin/index.html
- The failsafe plugin has default file patterns it looks for to run as integration tests
  - http://maven.apache.org/surefire/maven-failsafe-plugin/examples/inclusion-exclusion.html
- We're supposed to be able to include groups via the JUnit @Category
  - http://maven.apache.org/surefire/maven-failsafe-plugin/integration-test-mojo.html#groups
- We're supposed to be able to exclude tests via the JUnit @Category
  - http://maven.apache.org/surefire/maven-failsafe-plugin/integration-test-mojo.html#excludedGroups
