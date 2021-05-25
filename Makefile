.PHONY: test
test:
	sbt test

.PHONY: test-watch
test-watch:
	sbt "~test"

.PHONY: run
run:
	sbt run

.PHONY: build
build:
	sbt package

.PHONY: run-jar
run-jar:
	scala target/scala-2.13/mumble-scala_2.13-1.0.jar