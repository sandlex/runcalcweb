## Deployment steps

Install dependency to the project repository:

`mvn deploy:deploy-file -Durl=file:///Users/apeskov/Developer/runcalcweb/repo/ -Dfile=/Users/apeskov/Developer/runcalc/target/runcalc-2.0.jar -DgroupId=com.sandlex -DartifactId=runcalc -Dpackaging=jar -Dversion=2.0`

Testing:

`localhost:8080/calculate?paceBlock=T10=3:40&schema=3T10`
