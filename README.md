# First Steps in Domain-Driven Design 
![Build](https://github.com/andrewharmellaw/first-steps-in-ddd/workflows/Build/badge.svg) [![Known Vulnerabilities](https://snyk.io/test/github/andrewharmellaw/first-steps-in-ddd/badge.svg?targetFile=build.gradle)](https://snyk.io/test/github/andrewharmellaw/first-steps-in-ddd?targetFile=build.gradle)

This is the starter project for the exercises in the "First Steps in Domain-Driven Design" course on O'Reilly.  If you want to see the solutions, those are in a [separate repo](https://github.com/First-Steps-in-DDD-Community/first-steps-in-ddd-solutions). If you are more of a dotnet person, take a look at the [C# version of this codebase](https://github.com/First-Steps-in-DDD-Community/first-steps-in-ddd-solutions-dotnet/blob/main/README.md) (Thanks to @BAPostma for contributing this).

You should be able to fork and then clone this repo to get an almost-empty gradle project ready to work with.

## Pre-requisites
* Java JDK (at least Java 8)
* IDE of your choice
* Git client (unless you already have one in your IDE)
* You don't need to have Gradle as the gradle wrapper is part of this project and will download Gradle 7 for you. You might however want to use another gradle binary (such as the one which comes with IntelliJ IDEA) which should work fine

## What you get
A directory `first-steps-in-ddd` containing this README.md, a gradle build file with JUnit 5 dependencies
declared, standard `src` and `test` directory structure, and some example unit tests
(`APoliceInvestigation.java`, `APreChargeDecision.java` and `ACriminalCase.java`) and associated starter
classes (e.g. `PoliceInvestigation.java`, `PNCId.java`, `Suspect.java`) and an Enum, `CriminalOffence.java`.

## Up and running
The training relies entirely on your writing unit tests (ideally you use test-driven development)
so you want to be able to run them very quickly.

Open the newly checked out project in your IDE (probably point it at the build.gradle, or simply the
top-level project directory). Then check you can execute all the tests with the click of a single mouse
button, or ideally a single keyboard shortcut.

Additionally, it can be handy to check your build on the command line. Open a terminal and change to the
top-level project directory. Then run the command `./gradlew build`.  You ought to see your code and tests
compile, and all but one of the tests run successfully.

The failing test is where we will start exercise one.

## Get ahead of the game
We're going to work on this code based on a [Domain Expert Statement from a Public Prosecutor](https://docs.google.com/document/d/1HpRJj1lk_M80Xvwzs5F-lZ1oACkVNeWRMG0s7BQxZzk/edit?usp=sharing).  If you want to read it in advance, that'll help you in the first workshop exercise and beyond.
