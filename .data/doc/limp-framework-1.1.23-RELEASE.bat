@echo off&setlocal enabledelayedexpansion  
echo 正在安装本地jar到maven仓库,请稍等...
echo 当前目录=%~dp0  
echo 当前目录= %cd%

set pathBat=%0

set pathPom=!pathBat:bat=%pom!

set pathJar=!pathBat:bat=%jar!

set pathSource=!pathJar:RELEASE=%RELEASE-sources!

for %%i in (%0) do (set "name=%%~ni") 
set version=!name:limp-framework-=%!

call mvn install:install-file -Dfile=%pathJar% -DpomFile=%pathPom%  -DgroupId=com.chinasofti  -DartifactId=limp-framework -Dversion=%version% -Dpackaging=jar -DgeneratePom=true  -DcreateChecksum=true 
echo  ##################如果显示BUILD SUCCESS则安装成功#########################

call mvn install:install-file -Dfile=%pathSource% -DgroupId=com.chinasofti  -DartifactId=limp-framework -Dversion=%version% -Dpackaging=jar  -Dclassifier=sources
echo  ##################如果显示BUILD SUCCESS则安装成功#########################

echo  *******基本信息begin**********************
echo pathBat=%pathBat%
echo pathJar=%pathJar%
echo pathPom= %pathPom%
echo pathSource=%pathSource%
echo version=%version%


echo  -DgroupId=com.chinasofti
echo  -DartifactId=limp-framework
echo  -Dversion=%version%
echo  **********************基本信息end**********************
pause 

