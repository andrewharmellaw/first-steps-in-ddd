# First Steps in Domain-Driven Design ![Build](https://github.com/andrewharmellaw/first-steps-in-ddd/workflows/Build/badge.svg) [![Known Vulnerabilities](https://snyk.io/test/github/andrewharmellaw/first-steps-in-ddd/badge.svg?targetFile=build.gradle)](https://snyk.io/test/github/andrewharmellaw/first-steps-in-ddd?targetFile=build.gradle)
This is the starter project for the exercises in the "First Steps in Domain-Driven Design" course.

You should be able to fork and then clone this repo to get an almost empty gradle project ready to work in.

## Pre-requisites
* Java JDK (at least Java 8)
* IDE of your choice
* Git client (unless you already have one in your IDE)

## What you get
A directory `first-steps-in-ddd` containing this README.md, a gradle build file with JUnit 5 dependencies
declared, standard `src` and `test` directory structure, and some example unit tests
(`APoliceInvestigation.java`, `APreChargeDecision.java` and `ACriminalCase.java`) and associated starter
classes (e.g. `PoliceInvestigation.java`, `PNCId.java`, `Suspect.java`) and an Enum, `CriminalOffence.java`.

## Getting up and running
The training relies entirely on your writing unit tests (ideally you use test-driven development)
so you want to be able to run them very quickly.

Open the newly checked out project in your IDE (probably point it at the build.gradle, or simply the
top-level project directory). Then check you can execute all the tests with the click of a single mouse
button, or ideally a single keyboard shortcut.

Additionally, it can be handy to check your build on the command line. Open a terminal and change to the
top-level project directory. Then run the command `gradle build`.  You ought to see your code and tests
compile, and all but one of the tests run successfully.

The failing test is where we will start exercise one.
