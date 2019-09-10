Example auto versioning
====================================

All command below will update `pom.xml`

Set version manually
----------------------------------------------------------------

```sh
mvn clean versions:set -DnewVersion=1.0.1 package
```

If you just want automate version just use following command
----------------------------------------------------------------

```sh
mvn build-helper:parse-version versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.nextIncrementalVersion} versions:commit
```

this command will generate version "{major}.{minor}.{increment}"

current version : `1.0.1`

next version should be : `1.0.2`

Including git commit hash
----------------------------------------------------------------

```sh
mvn build-helper:parse-version versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.nextIncrementalVersion}-$(git rev-parse --short head) versions:commit
```

this command will generate version "{major}.{minor}.{increment}-{commit}"

current version : `1.0.1-c826052`

next version should be : `1.0.2-e648a88`
