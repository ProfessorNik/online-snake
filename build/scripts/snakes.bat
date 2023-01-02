@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  snakes startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and SNAKES_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\snakes-1.0-SNAPSHOT.jar;%APP_HOME%\lib\protobuf-kotlin-3.21.9.jar;%APP_HOME%\lib\validatorfx-0.2.1.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.6.10.jar
set MODULE_PATH=%APP_HOME%\lib\kotlin-stdlib-jdk8-1.6.10.jar;%APP_HOME%\lib\javafx-web-17.0.1-win.jar;%APP_HOME%\lib\javafx-media-17.0.1-win.jar;%APP_HOME%\lib\javafx-media-17.0.1.jar;%APP_HOME%\lib\javafx-fxml-17.0.1-win.jar;%APP_HOME%\lib\javafx-controls-17.0.1-win.jar;%APP_HOME%\lib\javafx-controls-17.0.1.jar;%APP_HOME%\lib\javafx-graphics-17.0.1-win.jar;%APP_HOME%\lib\javafx-graphics-17.0.1.jar;%APP_HOME%\lib\javafx-base-17.0.1-win.jar;%APP_HOME%\lib\javafx-base-17.0.1.jar;%APP_HOME%\lib\mapstruct-1.5.3.Final.jar;%APP_HOME%\lib\controlsfx-11.1.1.jar;%APP_HOME%\lib\formsfx-core-11.3.2.jar;%APP_HOME%\lib\ikonli-javafx-12.3.0.jar;%APP_HOME%\lib\bootstrapfx-core-0.4.0.jar;%APP_HOME%\lib\tilesfx-11.48.jar;%APP_HOME%\lib\fxgl-17.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.6.10.jar;%APP_HOME%\lib\fxgl-io-17.jar;%APP_HOME%\lib\fxgl-entity-17.jar;%APP_HOME%\lib\fxgl-gameplay-17.jar;%APP_HOME%\lib\fxgl-scene-17.jar;%APP_HOME%\lib\fxgl-core-17.jar;%APP_HOME%\lib\kotlin-stdlib-1.6.10.jar;%APP_HOME%\lib\kotlin-stdlib-1.6.10-modular.jar;%APP_HOME%\lib\protobuf-java-3.21.9.jar;%APP_HOME%\lib\ikonli-core-12.3.0.jar;%APP_HOME%\lib\jackson-annotations-2.12.1.jar;%APP_HOME%\lib\jackson-core-2.12.1.jar;%APP_HOME%\lib\jackson-databind-2.12.1.jar;%APP_HOME%\lib\lifecycle-4.0.9.jar;%APP_HOME%\lib\audio-4.0.9.jar;%APP_HOME%\lib\storage-4.0.9.jar;%APP_HOME%\lib\util-4.0.9.jar

@rem Execute snakes
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %SNAKES_OPTS%  -classpath "%CLASSPATH%" --module-path "%MODULE_PATH%" --module ru.fithub.snakes/ru.fithub.snakes.HelloApplication %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable SNAKES_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%SNAKES_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
