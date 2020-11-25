# fauci

`fauci` integrates Kotlin into an existing Java/Maven project, with examples and complete working code. We'll start with a basic Spring application in Java. Next, we'll add the necessary dependencies for Kotlin, and add some code that can live side by side with our current Java implementation. We'll use the power of git to create phases of the project. This will accomplish a few things: for one, we can make the changes in clear steps, and if anything gets messed up you can revert the entire branch to bring it back to the initial state. In addition, you can easily diff between branches and see all of the changes made in one place. While the differences in a simple project like this aren't terribly significant, this can be a decent way to just get a quick overview of what has changed between steps.

## Goals

We won't spend much time evangelizing Kotlin here, but suffice it to say that if you're looking to increase your productivity (and enjoyment) of writing applications on the JVM, adopting Kotlin is a great place to start.

## Base project

The base project is a simple REST service using Java and Spring. `fauci` was created using the [Spring Initializr][1]. If you're starting from scratch, or want to rebuild the structure of a current project to move to Gradle or just clean up your Maven build, I highly recommend it as a starting point. Once the project was created, the added single endpoint mostly follows the [Spring Guides][2] [Building a RESTful Web Service][3].

## Run Application

```
$ mvn spring-boot:run
```

Once the app has started, navigate (or curl) to http://localhost:8080/fauci and you should see some JSON returned.

Now switch to the dependencies branch to continue. You can use your IDE, or use the command line: `git checkout dependencies`

[1]: https://start.spring.io
[2]: https://spring.io/guides
[3]: https://spring.io/guides/gs/rest-service/
