@echo on

SET mypath=%~dp0
SET userprofil=%systemdrive%%homepath%
SET tomcatpath=C:\Program Files\Apache Software Foundation\Tomcat 9.0\bin

call mvn scm:checkout  -DconnectionUrl=scm:git:https://github.com/DavidTOUCHARD/CabinetMedecinMaven -DcheckoutDirectory=testMonappli

cd %mypath%\testMonappli\CabinetMedecin\

call mvn clean package

SET src=%mypath%\CabinetMedecin-presentation\target\CabinetMedecin-presentation.war
SET dest=C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\

copy %src% %dest%

call %tomcatpath%\startup.sh

start chrome http://localhost:7000/CabinetMedecin-presentation/

pause