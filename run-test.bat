set projectLocation=%projectLocation\TestRightMove%
set classpath=%projectLocation%\lib\*
set execution=mvn integration-test
%execution%
pause