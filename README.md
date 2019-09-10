Run Command
============

Set version manually
----------------------------------------------------------------

```sh
mvn clean versions:set -DnewVersion=1.0.1 package
```

Or if you just want automate version just use following command
----------------------------------------------------------------

```sh
mvn build-helper:parse-version versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.nextIncrementalVersion} versions:commit
```
