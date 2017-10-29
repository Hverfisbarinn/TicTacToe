# Hverfisbarinn Development Manual

## Introduction
---
This manual contains the necessary tools to get the project to build on a fresh machine and required steps for starting development.

## List of tools used
---
- [Github](https://git-scm.com/downloads)
- [Latest Java SE Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Gradle](https://gradle.org/install/)
- [ChromeDriver(for selenium tests)](https://sites.google.com/a/chromium.org/chromedriver/downloads)


## Required steps
---
### 1. Make sure [GitHub](https://github.com/) is installed
We use GitHub for version control development.
So if that's not installed you can install it [here](https://git-scm.com/downloads)   
Then you can simply clone the repository by entering the following command: 
~~~~~~~~
$ git clone https://github.com/Hverfisbarinn/TicTacToe.git`
~~~~~~~~
*Note: You will have to be granted access to our github orginization or repository
in order to clone, so request an invite from a [Hverfisbarinn](https://github.com/Hverfisbarinn) member.*

### 2. Install [lates Java SE Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

### 3. Install [Gradle](https://gradle.org/)
After install you should be able to enter the following commands:
- `$ gradle build` to build the project
- `$ gradle test` to run unit tests
- `$ gradle run` to run app on local server

### 4. Set up [Selenium](http://www.seleniumhq.org/) by installing [chromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)
To run Selenium we use [chromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)(only runs with Chrome browser).
Include both Chrome browser and ChromeDriver locations in your PATH environment variables.
Then you can run the selenium tests by entering the following command:
`$ gradle selenium`

## Contact us
---
If you need help with these steps or anything else feel free to contact us.
You can find our contact emails at our orginization: [Hverfisbarinn](https://github.com/Hverfisbarinn).