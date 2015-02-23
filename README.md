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

## First Experiment (FAST/SLOW)
(see the running-FAST-test.txt and not-running-SLOW-test.txt in the ModuleOne/src/test/resources folder)
- the surefire plugin did **NOT** run my 'integration test'. (MyFirstClassIT.java)
  - we'll check later if it DOES get run by the failsafe plugin
- specifying a group on the command line (**`-Dgroups=`) ONLY runs tests of that category
  - It has to be the fully qualified classname. (Fast didn't work by itself)
  - `Caused by: java.lang.ClassNotFoundException: Fast`
- I could prevent a Category from running in two ways:
  # use negation on the groups `-Dgroups=\!com.rhjensen.examples.junit.categories.moduleOne.Slow`
  # use excludedGroups `-DexcludedGroups=com.rhjensen.examples.junit.categories.moduleOne.Slow`

