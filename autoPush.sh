cd /developer/git-repository/mmall
git checkout mmall-v1.0
git fetch
git pull
mvn clean package -Driven.test.skip=true
rm /developer/apache-tomcat-7.0/webapps/ROOT.war
cp /developer/git-repository/mmall/target/mmall.war /developer/apache-tomcat-7/webapps/ROOT.war
rm -rf /developer/apache-tomcat-7/webapps/ROOT
/developer/apache-tomcat-7/bin/shutdoun.sh

for i in (1,10)
do
	sleep 1s
done

/developer/apache-tomcat-7/bin/startup.sh