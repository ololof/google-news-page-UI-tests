
# Some UI tests for Google News Page

Test cases:
1. Check that page is loaded
2. Check that the weather is displayed for your city
3. Check that number of news is more than one

## Installation

Check the Maven is installed

```bash
mvn -version 
```
Install Chrome driver

```bash
brew install --cask chromedriver 
```

## Run tests

```bash
mvn clean test -DsuiteXMLFile=./resources/all-tests.xml
