@echo OFF

set result=100

for %%X in (tc\Subtask1\in\0\*) do (
	echo %%X
	call "Solution\jualayam.exe" < %%X > Solution\%%~nX.out
	fc Solution\%%~nX.out tc\Subtask1\out\0\%%~nX.out > nul
	if errorlevel 1 (
		set result=0
		echo Wrong Answer
	) else (
		echo Accepted
	)
)


if %result% == 100 (
	echo Score : %result%
) else (
	echo Score : 0
)

pause
@echo OFF
