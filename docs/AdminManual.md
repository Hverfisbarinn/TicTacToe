# Administration Manual for TicTacToe

## Software needed.
To run this TicTacToe program on a fresh machine you need the following software:

- [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
- [Gradle](https://docs.gradle.org/current/userguide/installation.html)
- [Heroku Toolbelt](https://toolbelt.heroku.com/)
- [Travis - CI](https://github.com/travis-ci/travis.rb)
- [Chrome](https://www.google.com/chrome/)
- [Chromedriver](https://sites.google.com/a/chromium.org/chromedriver/)

Clicking the names will give you information on how to download and install the software.

## Cloning the project.
- After installing the missing softwares clone the git repository of the project by using this command in the desired location
~~~
git clone https://github.com/Hverfisbarinn/TicTacToe.git
~~~

## Deployment
# Creating a new Heroku application
- First of all you need to login into Heroku using: `Heroku login`
- After accessing the root of the project calling `Heroku Create [Custom Name]` will create a Heroku application with your custom name.
- When a Heroku application has been created you can run `git push Heroku Master` to deploy that code onto your Heroku server.
- After deployment you access your newly deployed application by typing (https://[Custom Name].herokuapp.com/) with the custom name same as above.

## Maintenance
- If you want to get access of the latest version of the repository you have to access the project root and type 
~~~
`git pull origin master`. 
~~~

## Running tests
- The only thing you need to do to run the unit test is to be in the root of the project and insert `Gradle build test` and then you can see if all your test have succeeded or failed.
- For the Selenium tests you input `Gradle Selenium` and then the [chromedriver](https://sites.google.com/a/chromium.org/chromedriver/) will work its magic.

_if you are running on a non-unix environment you will have to call `./gradlew` instead of just `gradle`_


